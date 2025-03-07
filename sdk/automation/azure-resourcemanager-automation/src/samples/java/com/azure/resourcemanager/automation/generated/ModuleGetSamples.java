// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

/**
 * Samples for Module Get.
 */
public final class ModuleGetSamples {
    /*
     * x-ms-original-file:
     * specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/getModule.json
     */
    /**
     * Sample code: Get a module.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void getAModule(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.modules()
            .getWithResponse("rg", "myAutomationAccount33", "OmsCompositeResources", com.azure.core.util.Context.NONE);
    }
}
