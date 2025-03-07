// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.providerhub.ProviderHubManager;
import com.azure.resourcemanager.providerhub.models.ProvisioningState;
import com.azure.resourcemanager.providerhub.models.SkuResource;
import com.azure.resourcemanager.providerhub.models.SkuScaleType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SkusListByResourceTypeRegistrationsNestedResourceTypeSecondMockTests {
    @Test
    public void testListByResourceTypeRegistrationsNestedResourceTypeSecond() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"skuSettings\":[{\"name\":\"skx\",\"tier\":\"ansbvriaqg\",\"size\":\"ojrulfuctejrt\",\"family\":\"fjzhxl\",\"kind\":\"bqjr\",\"locations\":[\"vrjeqmtzzbeqrztr\",\"alx\",\"d\"],\"locationInfo\":[{\"location\":\"srwrsnrhpqati\"},{\"location\":\"kkvyanxk\"},{\"location\":\"vcsemsvuvdj\"},{\"location\":\"qxetqmmlivrjjx\"}],\"requiredQuotaIds\":[\"dchpojxlehzl\",\"pgfquwzpwiibelwc\"],\"requiredFeatures\":[\"kwbpjxljtxbusq\",\"bxxn\"],\"capacity\":{\"minimum\":132768417,\"maximum\":972835304,\"default\":298319215,\"scaleType\":\"None\"},\"costs\":[{\"meterId\":\"zpa\"},{\"meterId\":\"secnadbuwqrgxf\"}],\"capabilities\":[{\"name\":\"qiynez\",\"value\":\"ellnkkii\"},{\"name\":\"vmtumxpym\",\"value\":\"jfuaxroqvqpilrgu\"}]},{\"name\":\"canlduwzorxs\",\"tier\":\"x\",\"size\":\"klxymxkqvfqepdxc\",\"family\":\"uubwyvpjb\",\"kind\":\"cpj\",\"locations\":[\"qgi\",\"exkydfb\"],\"locationInfo\":[{\"location\":\"avhuerkjddvrglie\"}],\"requiredQuotaIds\":[\"cvbiiftksdw\",\"dnkefgm\",\"dhcebuv\"],\"requiredFeatures\":[\"db\",\"lzoutbaaqgzekaj\",\"lyzgsnor\"],\"capacity\":{\"minimum\":562724806,\"maximum\":2008025421,\"default\":477935303,\"scaleType\":\"Manual\"},\"costs\":[{\"meterId\":\"rxkhlob\"},{\"meterId\":\"vjb\"},{\"meterId\":\"vhdi\"}],\"capabilities\":[{\"name\":\"fluiyuosnuud\",\"value\":\"elvhyibdrqrswh\"},{\"name\":\"uubpyrow\",\"value\":\"joxztfwfqchvczev\"},{\"name\":\"nnctagfyvrt\",\"value\":\"qpemh\"},{\"name\":\"cgkrepdqhqy\",\"value\":\"wqwemvxqabckmze\"}]}],\"provisioningState\":\"MovingResources\"},\"id\":\"nhgr\",\"name\":\"ohtwhlpuzj\",\"type\":\"ceezn\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ProviderHubManager manager = ProviderHubManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SkuResource> response = manager.skus()
            .listByResourceTypeRegistrationsNestedResourceTypeSecond("jxcxxq", "dcqjkedwqurc", "ojmrvvxwjongzse",
                "qqrsil", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("skx", response.iterator().next().properties().skuSettings().get(0).name());
        Assertions.assertEquals("ansbvriaqg", response.iterator().next().properties().skuSettings().get(0).tier());
        Assertions.assertEquals("ojrulfuctejrt", response.iterator().next().properties().skuSettings().get(0).size());
        Assertions.assertEquals("fjzhxl", response.iterator().next().properties().skuSettings().get(0).family());
        Assertions.assertEquals("bqjr", response.iterator().next().properties().skuSettings().get(0).kind());
        Assertions.assertEquals("vrjeqmtzzbeqrztr",
            response.iterator().next().properties().skuSettings().get(0).locations().get(0));
        Assertions.assertEquals("srwrsnrhpqati",
            response.iterator().next().properties().skuSettings().get(0).locationInfo().get(0).location());
        Assertions.assertEquals("dchpojxlehzl",
            response.iterator().next().properties().skuSettings().get(0).requiredQuotaIds().get(0));
        Assertions.assertEquals("kwbpjxljtxbusq",
            response.iterator().next().properties().skuSettings().get(0).requiredFeatures().get(0));
        Assertions.assertEquals(132768417,
            response.iterator().next().properties().skuSettings().get(0).capacity().minimum());
        Assertions.assertEquals(972835304,
            response.iterator().next().properties().skuSettings().get(0).capacity().maximum());
        Assertions.assertEquals(298319215,
            response.iterator().next().properties().skuSettings().get(0).capacity().defaultProperty());
        Assertions.assertEquals(SkuScaleType.NONE,
            response.iterator().next().properties().skuSettings().get(0).capacity().scaleType());
        Assertions.assertEquals("zpa",
            response.iterator().next().properties().skuSettings().get(0).costs().get(0).meterId());
        Assertions.assertEquals("qiynez",
            response.iterator().next().properties().skuSettings().get(0).capabilities().get(0).name());
        Assertions.assertEquals("ellnkkii",
            response.iterator().next().properties().skuSettings().get(0).capabilities().get(0).value());
        Assertions.assertEquals(ProvisioningState.MOVING_RESOURCES,
            response.iterator().next().properties().provisioningState());
    }
}
