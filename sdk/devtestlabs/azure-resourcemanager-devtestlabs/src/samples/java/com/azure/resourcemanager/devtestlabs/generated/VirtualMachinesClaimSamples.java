// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

/**
 * Samples for VirtualMachines Claim.
 */
public final class VirtualMachinesClaimSamples {
    /*
     * x-ms-original-file:
     * specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/VirtualMachines_Claim.
     * json
     */
    /**
     * Sample code: VirtualMachines_Claim.
     * 
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void virtualMachinesClaim(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager.virtualMachines().claim("resourceGroupName", "{labName}", "{vmName}", com.azure.core.util.Context.NONE);
    }
}
