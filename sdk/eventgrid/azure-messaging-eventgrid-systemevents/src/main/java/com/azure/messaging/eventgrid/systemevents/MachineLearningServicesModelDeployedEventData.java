// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.MachineLearningServices.ModelDeployed event.
 */
@Immutable
public final class MachineLearningServicesModelDeployedEventData
    implements JsonSerializable<MachineLearningServicesModelDeployedEventData> {
    /*
     * The name of the deployed service.
     */
    @Generated
    private String serviceName;

    /*
     * The compute type (e.g. ACI, AKS) of the deployed service.
     */
    @Generated
    private String serviceComputeType;

    /*
     * A common separated list of model IDs. The IDs of the models deployed in the service.
     */
    @Generated
    private String modelIds;

    /*
     * The tags of the deployed service.
     */
    @Generated
    private final Map<String, BinaryData> serviceTags;

    /*
     * The properties of the deployed service.
     */
    @Generated
    private final Map<String, BinaryData> serviceProperties;

    /**
     * Creates an instance of MachineLearningServicesModelDeployedEventData class.
     * 
     * @param serviceTags the serviceTags value to set.
     * @param serviceProperties the serviceProperties value to set.
     */
    @Generated
    private MachineLearningServicesModelDeployedEventData(Map<String, BinaryData> serviceTags,
        Map<String, BinaryData> serviceProperties) {
        this.serviceTags = serviceTags;
        this.serviceProperties = serviceProperties;
    }

    /**
     * Get the serviceName property: The name of the deployed service.
     * 
     * @return the serviceName value.
     */
    @Generated
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Get the serviceComputeType property: The compute type (e.g. ACI, AKS) of the deployed service.
     * 
     * @return the serviceComputeType value.
     */
    @Generated
    public String getServiceComputeType() {
        return this.serviceComputeType;
    }

    /**
     * Get the modelIds property: A common separated list of model IDs. The IDs of the models deployed in the service.
     * 
     * @return the modelIds value.
     */
    @Generated
    public String getModelIds() {
        return this.modelIds;
    }

    /**
     * Get the serviceTags property: The tags of the deployed service.
     * 
     * @return the serviceTags value.
     */
    @Generated
    public Map<String, BinaryData> getServiceTags() {
        return this.serviceTags;
    }

    /**
     * Get the serviceProperties property: The properties of the deployed service.
     * 
     * @return the serviceProperties value.
     */
    @Generated
    public Map<String, BinaryData> getServiceProperties() {
        return this.serviceProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("serviceTags", this.serviceTags,
            (writer, element) -> writer.writeUntyped(element == null ? null : element.toObject(Object.class)));
        jsonWriter.writeMapField("serviceProperties", this.serviceProperties,
            (writer, element) -> writer.writeUntyped(element == null ? null : element.toObject(Object.class)));
        jsonWriter.writeStringField("serviceName", this.serviceName);
        jsonWriter.writeStringField("serviceComputeType", this.serviceComputeType);
        jsonWriter.writeStringField("modelIds", this.modelIds);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MachineLearningServicesModelDeployedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MachineLearningServicesModelDeployedEventData if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MachineLearningServicesModelDeployedEventData.
     */
    @Generated
    public static MachineLearningServicesModelDeployedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Map<String, BinaryData> serviceTags = null;
            Map<String, BinaryData> serviceProperties = null;
            String serviceName = null;
            String serviceComputeType = null;
            String modelIds = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceTags".equals(fieldName)) {
                    serviceTags = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                } else if ("serviceProperties".equals(fieldName)) {
                    serviceProperties = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                } else if ("serviceName".equals(fieldName)) {
                    serviceName = reader.getString();
                } else if ("serviceComputeType".equals(fieldName)) {
                    serviceComputeType = reader.getString();
                } else if ("modelIds".equals(fieldName)) {
                    modelIds = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            MachineLearningServicesModelDeployedEventData deserializedMachineLearningServicesModelDeployedEventData
                = new MachineLearningServicesModelDeployedEventData(serviceTags, serviceProperties);
            deserializedMachineLearningServicesModelDeployedEventData.serviceName = serviceName;
            deserializedMachineLearningServicesModelDeployedEventData.serviceComputeType = serviceComputeType;
            deserializedMachineLearningServicesModelDeployedEventData.modelIds = modelIds;

            return deserializedMachineLearningServicesModelDeployedEventData;
        });
    }
}
