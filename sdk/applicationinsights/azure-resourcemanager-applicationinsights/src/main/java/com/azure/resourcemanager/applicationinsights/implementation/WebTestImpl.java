// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.WebTestInner;
import com.azure.resourcemanager.applicationinsights.models.TagsResource;
import com.azure.resourcemanager.applicationinsights.models.WebTest;
import com.azure.resourcemanager.applicationinsights.models.WebTestGeolocation;
import com.azure.resourcemanager.applicationinsights.models.WebTestKind;
import com.azure.resourcemanager.applicationinsights.models.WebTestPropertiesConfiguration;
import com.azure.resourcemanager.applicationinsights.models.WebTestPropertiesRequest;
import com.azure.resourcemanager.applicationinsights.models.WebTestPropertiesValidationRules;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class WebTestImpl implements WebTest, WebTest.Definition, WebTest.Update {
    private WebTestInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public WebTestKind kind() {
        return this.innerModel().kind();
    }

    public String syntheticMonitorId() {
        return this.innerModel().syntheticMonitorId();
    }

    public String webTestName() {
        return this.innerModel().webTestName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public Integer frequency() {
        return this.innerModel().frequency();
    }

    public Integer timeout() {
        return this.innerModel().timeout();
    }

    public WebTestKind webTestKind() {
        return this.innerModel().webTestKind();
    }

    public Boolean retryEnabled() {
        return this.innerModel().retryEnabled();
    }

    public List<WebTestGeolocation> locations() {
        List<WebTestGeolocation> inner = this.innerModel().locations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public WebTestPropertiesConfiguration configuration() {
        return this.innerModel().configuration();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public WebTestPropertiesRequest request() {
        return this.innerModel().request();
    }

    public WebTestPropertiesValidationRules validationRules() {
        return this.innerModel().validationRules();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public WebTestInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String webTestName;

    private TagsResource updateWebTestTags;

    public WebTestImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public WebTest create() {
        this.innerObject = serviceManager.serviceClient()
            .getWebTests()
            .createOrUpdateWithResponse(resourceGroupName, webTestName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public WebTest create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWebTests()
            .createOrUpdateWithResponse(resourceGroupName, webTestName, this.innerModel(), context)
            .getValue();
        return this;
    }

    WebTestImpl(String name, com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerObject = new WebTestInner();
        this.serviceManager = serviceManager;
        this.webTestName = name;
    }

    public WebTestImpl update() {
        this.updateWebTestTags = new TagsResource();
        return this;
    }

    public WebTest apply() {
        this.innerObject = serviceManager.serviceClient()
            .getWebTests()
            .updateTagsWithResponse(resourceGroupName, webTestName, updateWebTestTags, Context.NONE)
            .getValue();
        return this;
    }

    public WebTest apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWebTests()
            .updateTagsWithResponse(resourceGroupName, webTestName, updateWebTestTags, context)
            .getValue();
        return this;
    }

    WebTestImpl(WebTestInner innerObject,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.webTestName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "webtests");
    }

    public WebTest refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getWebTests()
            .getByResourceGroupWithResponse(resourceGroupName, webTestName, Context.NONE)
            .getValue();
        return this;
    }

    public WebTest refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWebTests()
            .getByResourceGroupWithResponse(resourceGroupName, webTestName, context)
            .getValue();
        return this;
    }

    public WebTestImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WebTestImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WebTestImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateWebTestTags.withTags(tags);
            return this;
        }
    }

    public WebTestImpl withKind(WebTestKind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public WebTestImpl withSyntheticMonitorId(String syntheticMonitorId) {
        this.innerModel().withSyntheticMonitorId(syntheticMonitorId);
        return this;
    }

    public WebTestImpl withWebTestName(String webTestName) {
        this.innerModel().withWebTestName(webTestName);
        return this;
    }

    public WebTestImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public WebTestImpl withEnabled(Boolean enabled) {
        this.innerModel().withEnabled(enabled);
        return this;
    }

    public WebTestImpl withFrequency(Integer frequency) {
        this.innerModel().withFrequency(frequency);
        return this;
    }

    public WebTestImpl withTimeout(Integer timeout) {
        this.innerModel().withTimeout(timeout);
        return this;
    }

    public WebTestImpl withWebTestKind(WebTestKind webTestKind) {
        this.innerModel().withWebTestKind(webTestKind);
        return this;
    }

    public WebTestImpl withRetryEnabled(Boolean retryEnabled) {
        this.innerModel().withRetryEnabled(retryEnabled);
        return this;
    }

    public WebTestImpl withLocations(List<WebTestGeolocation> locations) {
        this.innerModel().withLocations(locations);
        return this;
    }

    public WebTestImpl withConfiguration(WebTestPropertiesConfiguration configuration) {
        this.innerModel().withConfiguration(configuration);
        return this;
    }

    public WebTestImpl withRequest(WebTestPropertiesRequest request) {
        this.innerModel().withRequest(request);
        return this;
    }

    public WebTestImpl withValidationRules(WebTestPropertiesValidationRules validationRules) {
        this.innerModel().withValidationRules(validationRules);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
