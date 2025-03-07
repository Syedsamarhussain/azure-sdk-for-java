// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The helm deployment options.
 */
@Fluent
public final class HelmMappingRuleProfileOptions implements JsonSerializable<HelmMappingRuleProfileOptions> {
    /*
     * The helm deployment install options
     */
    private HelmInstallOptions installOptions;

    /*
     * The helm deployment upgrade options
     */
    private HelmUpgradeOptions upgradeOptions;

    /**
     * Creates an instance of HelmMappingRuleProfileOptions class.
     */
    public HelmMappingRuleProfileOptions() {
    }

    /**
     * Get the installOptions property: The helm deployment install options.
     * 
     * @return the installOptions value.
     */
    public HelmInstallOptions installOptions() {
        return this.installOptions;
    }

    /**
     * Set the installOptions property: The helm deployment install options.
     * 
     * @param installOptions the installOptions value to set.
     * @return the HelmMappingRuleProfileOptions object itself.
     */
    public HelmMappingRuleProfileOptions withInstallOptions(HelmInstallOptions installOptions) {
        this.installOptions = installOptions;
        return this;
    }

    /**
     * Get the upgradeOptions property: The helm deployment upgrade options.
     * 
     * @return the upgradeOptions value.
     */
    public HelmUpgradeOptions upgradeOptions() {
        return this.upgradeOptions;
    }

    /**
     * Set the upgradeOptions property: The helm deployment upgrade options.
     * 
     * @param upgradeOptions the upgradeOptions value to set.
     * @return the HelmMappingRuleProfileOptions object itself.
     */
    public HelmMappingRuleProfileOptions withUpgradeOptions(HelmUpgradeOptions upgradeOptions) {
        this.upgradeOptions = upgradeOptions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (installOptions() != null) {
            installOptions().validate();
        }
        if (upgradeOptions() != null) {
            upgradeOptions().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("installOptions", this.installOptions);
        jsonWriter.writeJsonField("upgradeOptions", this.upgradeOptions);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HelmMappingRuleProfileOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HelmMappingRuleProfileOptions if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HelmMappingRuleProfileOptions.
     */
    public static HelmMappingRuleProfileOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HelmMappingRuleProfileOptions deserializedHelmMappingRuleProfileOptions
                = new HelmMappingRuleProfileOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("installOptions".equals(fieldName)) {
                    deserializedHelmMappingRuleProfileOptions.installOptions = HelmInstallOptions.fromJson(reader);
                } else if ("upgradeOptions".equals(fieldName)) {
                    deserializedHelmMappingRuleProfileOptions.upgradeOptions = HelmUpgradeOptions.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHelmMappingRuleProfileOptions;
        });
    }
}
