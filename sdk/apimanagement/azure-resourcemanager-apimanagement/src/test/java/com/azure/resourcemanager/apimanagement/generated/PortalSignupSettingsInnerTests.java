// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalSignupSettingsInner;
import com.azure.resourcemanager.apimanagement.models.TermsOfServiceProperties;
import org.junit.jupiter.api.Assertions;

public final class PortalSignupSettingsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PortalSignupSettingsInner model = BinaryData.fromString(
            "{\"properties\":{\"enabled\":false,\"termsOfService\":{\"text\":\"wnhkgq\",\"enabled\":false,\"consentRequired\":false}},\"id\":\"stcivrak\",\"name\":\"rrynjcwmhly\",\"type\":\"gnukxrkemjpe\"}")
            .toObject(PortalSignupSettingsInner.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("wnhkgq", model.termsOfService().text());
        Assertions.assertEquals(false, model.termsOfService().enabled());
        Assertions.assertEquals(false, model.termsOfService().consentRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PortalSignupSettingsInner model = new PortalSignupSettingsInner().withEnabled(false)
            .withTermsOfService(
                new TermsOfServiceProperties().withText("wnhkgq").withEnabled(false).withConsentRequired(false));
        model = BinaryData.fromObject(model).toObject(PortalSignupSettingsInner.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("wnhkgq", model.termsOfService().text());
        Assertions.assertEquals(false, model.termsOfService().enabled());
        Assertions.assertEquals(false, model.termsOfService().consentRequired());
    }
}
