// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DeviceManagementGetDeploymentStatusTests extends DeviceUpdateClientTestBase {
    @Test
    @Disabled
    public void testDeviceManagementGetDeploymentStatusTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response
            = deviceManagementClient.getDeploymentStatusWithResponse("TestGroup", "deploymentId", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(BinaryData.fromString(
            "{\"deploymentState\":\"ActiveWithSubgroupFailures\",\"groupId\":\"TestGroup\",\"subgroupStatus\":[{\"deploymentState\":\"Active\",\"deviceClassId\":\"deviceClassId1\",\"devicesCanceledCount\":0,\"devicesCompletedFailedCount\":0,\"devicesCompletedSucceededCount\":1,\"devicesInProgressCount\":0,\"groupId\":\"TestGroup\",\"totalDevices\":1},{\"deploymentState\":\"Failed\",\"deviceClassId\":\"deviceClassId2\",\"devicesCanceledCount\":0,\"devicesCompletedFailedCount\":1,\"devicesCompletedSucceededCount\":1,\"devicesInProgressCount\":0,\"error\":{\"code\":\"ADMConfigurationLimitExceeded\",\"message\":\"The subgroup deployment failed to be created due to hitting the ADM configuration limit\"},\"groupId\":\"TestGroup\",\"totalDevices\":2}]}")
            .toObject(Object.class), response.getValue().toObject(Object.class));
    }
}
