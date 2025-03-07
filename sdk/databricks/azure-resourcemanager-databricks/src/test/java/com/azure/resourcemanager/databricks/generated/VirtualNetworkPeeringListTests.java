// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.fluent.models.VirtualNetworkPeeringInner;
import com.azure.resourcemanager.databricks.models.AddressSpace;
import com.azure.resourcemanager.databricks.models.VirtualNetworkPeeringList;
import com.azure.resourcemanager.databricks.models.VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork;
import com.azure.resourcemanager.databricks.models.VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetwork;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkPeeringListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkPeeringList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"allowVirtualNetworkAccess\":true,\"allowForwardedTraffic\":true,\"allowGatewayTransit\":true,\"useRemoteGateways\":false,\"databricksVirtualNetwork\":{\"id\":\"eypvhezrkg\"},\"databricksAddressSpace\":{\"addressPrefixes\":[\"refovgmkqsleyyvx\",\"qjpkcattpngjcrc\",\"zsqpjhvmdajvny\",\"ounqecano\"]},\"remoteVirtualNetwork\":{\"id\":\"upfh\"},\"remoteAddressSpace\":{\"addressPrefixes\":[\"rpmopjmc\",\"atuokthfuiu\"]},\"peeringState\":\"Initiated\",\"provisioningState\":\"Succeeded\"},\"id\":\"cpkvxodp\",\"name\":\"ozmyzydagfu\",\"type\":\"xbezyiuokktwh\"},{\"properties\":{\"allowVirtualNetworkAccess\":false,\"allowForwardedTraffic\":true,\"allowGatewayTransit\":false,\"useRemoteGateways\":false,\"databricksVirtualNetwork\":{\"id\":\"surex\"},\"databricksAddressSpace\":{\"addressPrefixes\":[\"yocf\",\"fksymddystki\",\"uxh\",\"yudxorrqnbp\"]},\"remoteVirtualNetwork\":{\"id\":\"zvyifqrvkdvj\"},\"remoteAddressSpace\":{\"addressPrefixes\":[\"mvvd\"]},\"peeringState\":\"Disconnected\",\"provisioningState\":\"Failed\"},\"id\":\"pnpulexxbczwtru\",\"name\":\"iqzbq\",\"type\":\"vsovmyokac\"}],\"nextLink\":\"kwlhzdo\"}")
            .toObject(VirtualNetworkPeeringList.class);
        Assertions.assertEquals(true, model.value().get(0).allowVirtualNetworkAccess());
        Assertions.assertEquals(true, model.value().get(0).allowForwardedTraffic());
        Assertions.assertEquals(true, model.value().get(0).allowGatewayTransit());
        Assertions.assertEquals(false, model.value().get(0).useRemoteGateways());
        Assertions.assertEquals("eypvhezrkg", model.value().get(0).databricksVirtualNetwork().id());
        Assertions.assertEquals("refovgmkqsleyyvx",
            model.value().get(0).databricksAddressSpace().addressPrefixes().get(0));
        Assertions.assertEquals("upfh", model.value().get(0).remoteVirtualNetwork().id());
        Assertions.assertEquals("rpmopjmc", model.value().get(0).remoteAddressSpace().addressPrefixes().get(0));
        Assertions.assertEquals("kwlhzdo", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkPeeringList model = new VirtualNetworkPeeringList()
            .withValue(Arrays.asList(
                new VirtualNetworkPeeringInner().withAllowVirtualNetworkAccess(true)
                    .withAllowForwardedTraffic(true)
                    .withAllowGatewayTransit(true)
                    .withUseRemoteGateways(false)
                    .withDatabricksVirtualNetwork(
                        new VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork().withId("eypvhezrkg"))
                    .withDatabricksAddressSpace(new AddressSpace().withAddressPrefixes(
                        Arrays.asList("refovgmkqsleyyvx", "qjpkcattpngjcrc", "zsqpjhvmdajvny", "ounqecano")))
                    .withRemoteVirtualNetwork(
                        new VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetwork().withId("upfh"))
                    .withRemoteAddressSpace(
                        new AddressSpace().withAddressPrefixes(Arrays.asList("rpmopjmc", "atuokthfuiu"))),
                new VirtualNetworkPeeringInner().withAllowVirtualNetworkAccess(false)
                    .withAllowForwardedTraffic(true)
                    .withAllowGatewayTransit(false)
                    .withUseRemoteGateways(false)
                    .withDatabricksVirtualNetwork(
                        new VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork().withId("surex"))
                    .withDatabricksAddressSpace(new AddressSpace()
                        .withAddressPrefixes(Arrays.asList("yocf", "fksymddystki", "uxh", "yudxorrqnbp")))
                    .withRemoteVirtualNetwork(
                        new VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetwork().withId("zvyifqrvkdvj"))
                    .withRemoteAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("mvvd")))))
            .withNextLink("kwlhzdo");
        model = BinaryData.fromObject(model).toObject(VirtualNetworkPeeringList.class);
        Assertions.assertEquals(true, model.value().get(0).allowVirtualNetworkAccess());
        Assertions.assertEquals(true, model.value().get(0).allowForwardedTraffic());
        Assertions.assertEquals(true, model.value().get(0).allowGatewayTransit());
        Assertions.assertEquals(false, model.value().get(0).useRemoteGateways());
        Assertions.assertEquals("eypvhezrkg", model.value().get(0).databricksVirtualNetwork().id());
        Assertions.assertEquals("refovgmkqsleyyvx",
            model.value().get(0).databricksAddressSpace().addressPrefixes().get(0));
        Assertions.assertEquals("upfh", model.value().get(0).remoteVirtualNetwork().id());
        Assertions.assertEquals("rpmopjmc", model.value().get(0).remoteAddressSpace().addressPrefixes().get(0));
        Assertions.assertEquals("kwlhzdo", model.nextLink());
    }
}
