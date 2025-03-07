// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ApiVersionSetsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiVersionSetContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetContract;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSets;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetsGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetsGetResponse;

public final class ApiVersionSetsImpl implements ApiVersionSets {
    private static final ClientLogger LOGGER = new ClientLogger(ApiVersionSetsImpl.class);

    private final ApiVersionSetsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ApiVersionSetsImpl(ApiVersionSetsClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApiVersionSetContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<ApiVersionSetContractInner> inner
            = this.serviceClient().listByService(resourceGroupName, serviceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApiVersionSetContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ApiVersionSetContract> listByService(String resourceGroupName, String serviceName,
        String filter, Integer top, Integer skip, Context context) {
        PagedIterable<ApiVersionSetContractInner> inner
            = this.serviceClient().listByService(resourceGroupName, serviceName, filter, top, skip, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApiVersionSetContractImpl(inner1, this.manager()));
    }

    public ApiVersionSetsGetEntityTagResponse getEntityTagWithResponse(String resourceGroupName, String serviceName,
        String versionSetId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, versionSetId, context);
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String versionSetId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, versionSetId);
    }

    public Response<ApiVersionSetContract> getWithResponse(String resourceGroupName, String serviceName,
        String versionSetId, Context context) {
        ApiVersionSetsGetResponse inner
            = this.serviceClient().getWithResponse(resourceGroupName, serviceName, versionSetId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ApiVersionSetContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApiVersionSetContract get(String resourceGroupName, String serviceName, String versionSetId) {
        ApiVersionSetContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, versionSetId);
        if (inner != null) {
            return new ApiVersionSetContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String versionSetId,
        String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, versionSetId, ifMatch, context);
    }

    public void delete(String resourceGroupName, String serviceName, String versionSetId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, versionSetId, ifMatch);
    }

    public ApiVersionSetContract getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String versionSetId = ResourceManagerUtils.getValueFromIdByName(id, "apiVersionSets");
        if (versionSetId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'apiVersionSets'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, versionSetId, Context.NONE).getValue();
    }

    public Response<ApiVersionSetContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String versionSetId = ResourceManagerUtils.getValueFromIdByName(id, "apiVersionSets");
        if (versionSetId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'apiVersionSets'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, versionSetId, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String versionSetId = ResourceManagerUtils.getValueFromIdByName(id, "apiVersionSets");
        if (versionSetId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'apiVersionSets'.", id)));
        }
        String localIfMatch = null;
        this.deleteWithResponse(resourceGroupName, serviceName, versionSetId, localIfMatch, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String versionSetId = ResourceManagerUtils.getValueFromIdByName(id, "apiVersionSets");
        if (versionSetId == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'apiVersionSets'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, versionSetId, ifMatch, context);
    }

    private ApiVersionSetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public ApiVersionSetContractImpl define(String name) {
        return new ApiVersionSetContractImpl(name, this.manager());
    }
}
