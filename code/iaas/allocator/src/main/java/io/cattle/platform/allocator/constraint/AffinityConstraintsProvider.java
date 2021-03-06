package io.cattle.platform.allocator.constraint;

import io.cattle.platform.allocator.service.AllocationAttempt;
import io.cattle.platform.allocator.service.AllocationLog;
import io.cattle.platform.allocator.service.AllocatorService;
import io.cattle.platform.core.constants.InstanceConstants;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.json.JsonMapper;
import io.cattle.platform.object.util.DataAccessor;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

/**
 * Future optimization: For hard constraints, we might be able to update the DB query to do
 * the lookup.
 *
 * @author sonchang
 *
 */
public class AffinityConstraintsProvider implements AllocationConstraintsProvider {

    @Inject
    JsonMapper jsonMapper;

    @Inject
    AllocatorService allocatorService;

    @SuppressWarnings("rawtypes")
    @Override
    public void appendConstraints(AllocationAttempt attempt, AllocationLog log,
            List<Constraint> constraints) {
        Instance instance = attempt.getInstance();
        if (instance == null) {
            return;
        }

        Map env = DataAccessor.fields(instance).withKey(InstanceConstants.FIELD_ENVIRONMENT).as(jsonMapper, Map.class);
        // TODO: hack for now.  assuming all affinity:constraint specs are just found in the key
        List<Constraint> affinityConstraintsFromEnv = allocatorService.extractConstraintsFromEnv(env);
        for (Constraint constraint : affinityConstraintsFromEnv) {
            constraints.add(constraint);
        }

        // Currently, intentionally duplicating code to be explicit
        Map labels = DataAccessor.fields(instance).withKey(InstanceConstants.FIELD_LABELS).as(jsonMapper, Map.class);
        List<Constraint> affinityConstraintsFromLabels = allocatorService.extractConstraintsFromLabels(labels);
        for (Constraint constraint : affinityConstraintsFromLabels) {
            constraints.add(constraint);
        }
    }

    @Override
    public boolean isCritical() {
        return false;
    }
}
