// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datalakeanalytics.fluent.AccountsClient;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeAnalyticsAccountBasicInner;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeAnalyticsAccountInner;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.NameAvailabilityInformationInner;
import com.azure.resourcemanager.datalakeanalytics.models.Accounts;
import com.azure.resourcemanager.datalakeanalytics.models.CheckNameAvailabilityParameters;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeAnalyticsAccount;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeAnalyticsAccountBasic;
import com.azure.resourcemanager.datalakeanalytics.models.NameAvailabilityInformation;

public final class AccountsImpl implements Accounts {
    private static final ClientLogger LOGGER = new ClientLogger(AccountsImpl.class);

    private final AccountsClient innerClient;

    private final com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager;

    public AccountsImpl(AccountsClient innerClient,
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataLakeAnalyticsAccountBasic> list() {
        PagedIterable<DataLakeAnalyticsAccountBasicInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new DataLakeAnalyticsAccountBasicImpl(inner1, this.manager()));
    }

    public PagedIterable<DataLakeAnalyticsAccountBasic> list(String filter, Integer top, Integer skip, String select,
        String orderby, Boolean count, Context context) {
        PagedIterable<DataLakeAnalyticsAccountBasicInner> inner
            = this.serviceClient().list(filter, top, skip, select, orderby, count, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new DataLakeAnalyticsAccountBasicImpl(inner1, this.manager()));
    }

    public PagedIterable<DataLakeAnalyticsAccountBasic> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DataLakeAnalyticsAccountBasicInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new DataLakeAnalyticsAccountBasicImpl(inner1, this.manager()));
    }

    public PagedIterable<DataLakeAnalyticsAccountBasic> listByResourceGroup(String resourceGroupName, String filter,
        Integer top, Integer skip, String select, String orderby, Boolean count, Context context) {
        PagedIterable<DataLakeAnalyticsAccountBasicInner> inner = this.serviceClient()
            .listByResourceGroup(resourceGroupName, filter, top, skip, select, orderby, count, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new DataLakeAnalyticsAccountBasicImpl(inner1, this.manager()));
    }

    public Response<DataLakeAnalyticsAccount> getByResourceGroupWithResponse(String resourceGroupName,
        String accountName, Context context) {
        Response<DataLakeAnalyticsAccountInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DataLakeAnalyticsAccountImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DataLakeAnalyticsAccount getByResourceGroup(String resourceGroupName, String accountName) {
        DataLakeAnalyticsAccountInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, accountName);
        if (inner != null) {
            return new DataLakeAnalyticsAccountImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String accountName) {
        this.serviceClient().delete(resourceGroupName, accountName);
    }

    public void delete(String resourceGroupName, String accountName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, context);
    }

    public Response<NameAvailabilityInformation> checkNameAvailabilityWithResponse(String location,
        CheckNameAvailabilityParameters parameters, Context context) {
        Response<NameAvailabilityInformationInner> inner
            = this.serviceClient().checkNameAvailabilityWithResponse(location, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NameAvailabilityInformationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NameAvailabilityInformation checkNameAvailability(String location,
        CheckNameAvailabilityParameters parameters) {
        NameAvailabilityInformationInner inner = this.serviceClient().checkNameAvailability(location, parameters);
        if (inner != null) {
            return new NameAvailabilityInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DataLakeAnalyticsAccount getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE).getValue();
    }

    public Response<DataLakeAnalyticsAccount> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        this.delete(resourceGroupName, accountName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        this.delete(resourceGroupName, accountName, context);
    }

    private AccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }

    public DataLakeAnalyticsAccountImpl define(String name) {
        return new DataLakeAnalyticsAccountImpl(name, this.manager());
    }
}
