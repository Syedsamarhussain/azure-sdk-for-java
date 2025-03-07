// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.Format;
import org.junit.jupiter.api.Assertions;

public final class FormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Format model
            = BinaryData.fromString("{\"@odata.type\":\"Format\",\"filenamePattern\":\"vvmu\"}").toObject(Format.class);
        Assertions.assertEquals("vvmu", model.filenamePattern());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Format model = new Format().withFilenamePattern("vvmu");
        model = BinaryData.fromObject(model).toObject(Format.class);
        Assertions.assertEquals("vvmu", model.filenamePattern());
    }
}
