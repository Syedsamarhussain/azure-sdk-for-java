// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The status of the cluster provisioning. The three terminal states are: Succeeded, Failed and Canceled.
 */
public final class ClusterProvisioningState extends ExpandableStringEnum<ClusterProvisioningState> {
    /**
     * Static value Succeeded for ClusterProvisioningState.
     */
    public static final ClusterProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for ClusterProvisioningState.
     */
    public static final ClusterProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for ClusterProvisioningState.
     */
    public static final ClusterProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value InProgress for ClusterProvisioningState.
     */
    public static final ClusterProvisioningState IN_PROGRESS = fromString("InProgress");

    /**
     * Creates a new instance of ClusterProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClusterProvisioningState() {
    }

    /**
     * Creates or finds a ClusterProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClusterProvisioningState.
     */
    public static ClusterProvisioningState fromString(String name) {
        return fromString(name, ClusterProvisioningState.class);
    }

    /**
     * Gets known ClusterProvisioningState values.
     * 
     * @return known ClusterProvisioningState values.
     */
    public static Collection<ClusterProvisioningState> values() {
        return values(ClusterProvisioningState.class);
    }
}
