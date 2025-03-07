// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.ComponentPolicyEvaluationDetails;
import org.junit.jupiter.api.Assertions;

public final class ComponentPolicyEvaluationDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComponentPolicyEvaluationDetails model = BinaryData.fromString(
            "{\"evaluatedExpressions\":[{\"result\":\"kcdxfzzzw\",\"expression\":\"afitlhguynuchlg\",\"expressionKind\":\"txd\",\"path\":\"mozusgzvlnsnnjz\",\"expressionValue\":\"dataafolpymwamxqzrag\",\"targetValue\":\"datadphtv\",\"operator\":\"lajv\"},{\"result\":\"jchcsrlzknmzla\",\"expression\":\"updwv\",\"expressionKind\":\"hcnzqt\",\"path\":\"hmqrhvthlaiwdc\",\"expressionValue\":\"datamlzzhzdtxetlgyd\",\"targetValue\":\"dataqvlnnpxybafiqgea\",\"operator\":\"bgj\"},{\"result\":\"glklb\",\"expression\":\"lidwcwvmzegjon\",\"expressionKind\":\"jirwgdnqzbrfk\",\"path\":\"zhzmtksjci\",\"expressionValue\":\"dataigsxcdgljplk\",\"targetValue\":\"dataacht\",\"operator\":\"flrytswfpfm\"},{\"result\":\"ycxnmskw\",\"expression\":\"jjyslurlps\",\"expressionKind\":\"kvp\",\"path\":\"wqslsrhmpqvw\",\"expressionValue\":\"datakondcb\",\"targetValue\":\"dataimuvqejosovyrrl\",\"operator\":\"esi\"}],\"reason\":\"qtljqobbpihehc\"}")
            .toObject(ComponentPolicyEvaluationDetails.class);
        Assertions.assertEquals("qtljqobbpihehc", model.reason());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComponentPolicyEvaluationDetails model = new ComponentPolicyEvaluationDetails().withReason("qtljqobbpihehc");
        model = BinaryData.fromObject(model).toObject(ComponentPolicyEvaluationDetails.class);
        Assertions.assertEquals("qtljqobbpihehc", model.reason());
    }
}
