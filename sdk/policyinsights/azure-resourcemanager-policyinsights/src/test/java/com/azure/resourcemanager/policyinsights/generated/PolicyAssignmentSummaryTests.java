// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.ComplianceDetail;
import com.azure.resourcemanager.policyinsights.models.PolicyAssignmentSummary;
import com.azure.resourcemanager.policyinsights.models.PolicyDefinitionSummary;
import com.azure.resourcemanager.policyinsights.models.PolicyGroupSummary;
import com.azure.resourcemanager.policyinsights.models.SummaryResults;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PolicyAssignmentSummaryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PolicyAssignmentSummary model = BinaryData.fromString(
            "{\"policyAssignmentId\":\"khocxvdfffwaf\",\"policySetDefinitionId\":\"oudaspavehhrvk\",\"results\":{\"queryResultsUri\":\"zoz\",\"nonCompliantResources\":83009194,\"nonCompliantPolicies\":529725461,\"resourceDetails\":[{\"complianceState\":\"oyxcdyuib\",\"count\":595382657},{\"complianceState\":\"nbzydvfvfcj\",\"count\":640278837},{\"complianceState\":\"isrvhm\",\"count\":144501476}],\"policyDetails\":[{\"complianceState\":\"kiscvwmzhwpl\",\"count\":57384767},{\"complianceState\":\"vxilcbt\",\"count\":896173123},{\"complianceState\":\"zeyqxtjjfzqlqhyc\",\"count\":1332514758}],\"policyGroupDetails\":[{\"complianceState\":\"xdbeesmieknl\",\"count\":929981365},{\"complianceState\":\"aawiuagydwqfb\",\"count\":293972975}]},\"policyDefinitions\":[{\"policyDefinitionId\":\"iagtc\",\"policyDefinitionReferenceId\":\"ocqwogfnzjvus\",\"policyDefinitionGroupNames\":[\"dmozu\"],\"effect\":\"lfsbtkadpysow\",\"results\":{\"queryResultsUri\":\"gkbugrjqct\",\"nonCompliantResources\":1966674078,\"nonCompliantPolicies\":1835646696,\"resourceDetails\":[{\"complianceState\":\"ieypef\",\"count\":1122373558}],\"policyDetails\":[{\"complianceState\":\"cuplcplcwkhih\",\"count\":184216647}],\"policyGroupDetails\":[{\"complianceState\":\"sqtzbsrg\",\"count\":1998399653},{\"complianceState\":\"jhf\",\"count\":1635200760},{\"complianceState\":\"cact\",\"count\":1291421637},{\"complianceState\":\"teyowclu\",\"count\":1896348924}]}},{\"policyDefinitionId\":\"kqvgqouw\",\"policyDefinitionReferenceId\":\"zmpjwyiv\",\"policyDefinitionGroupNames\":[\"f\",\"cvhrfsp\",\"uagrttikteusqc\"],\"effect\":\"vyklxuby\",\"results\":{\"queryResultsUri\":\"fmmfblcqcu\",\"nonCompliantResources\":1353373611,\"nonCompliantPolicies\":1215063805,\"resourceDetails\":[{\"complianceState\":\"a\",\"count\":1749229509},{\"complianceState\":\"ttwgdsl\",\"count\":1446225762}],\"policyDetails\":[{\"complianceState\":\"moo\",\"count\":806728338},{\"complianceState\":\"eypxiutcxapzhyr\",\"count\":290691580}],\"policyGroupDetails\":[{\"complianceState\":\"bjoxs\",\"count\":721490758}]}},{\"policyDefinitionId\":\"hlabrq\",\"policyDefinitionReferenceId\":\"kzjcjbtrgae\",\"policyDefinitionGroupNames\":[\"ib\"],\"effect\":\"jj\",\"results\":{\"queryResultsUri\":\"qbeitpkxztmoob\",\"nonCompliantResources\":358908286,\"nonCompliantPolicies\":1257381047,\"resourceDetails\":[{\"complianceState\":\"cwq\",\"count\":817120127},{\"complianceState\":\"aqxzhemjyho\",\"count\":633481749},{\"complianceState\":\"wtwko\",\"count\":2040452335},{\"complianceState\":\"ulkb\",\"count\":1523794500}],\"policyDetails\":[{\"complianceState\":\"njwltlwtjjgu\",\"count\":1983301203},{\"complianceState\":\"hsnvkcdmxzrp\",\"count\":1098344029},{\"complianceState\":\"lnwiaaomylwe\",\"count\":835106090}],\"policyGroupDetails\":[{\"complianceState\":\"ethwwnpjhlfz\",\"count\":1188676468}]}},{\"policyDefinitionId\":\"hwahfbousn\",\"policyDefinitionReferenceId\":\"pgfewetwlyx\",\"policyDefinitionGroupNames\":[\"xykxhdj\"],\"effect\":\"immbcx\",\"results\":{\"queryResultsUri\":\"cporxvxcjz\",\"nonCompliantResources\":1650285397,\"nonCompliantPolicies\":546914966,\"resourceDetails\":[{\"complianceState\":\"tgqscjavftjuh\",\"count\":360904293},{\"complianceState\":\"k\",\"count\":308398935},{\"complianceState\":\"uwpijr\",\"count\":1348420027}],\"policyDetails\":[{\"complianceState\":\"mghfcfiwrxgkne\",\"count\":942321971},{\"complianceState\":\"nzqodfvpg\",\"count\":1507856575},{\"complianceState\":\"gsgbpfgzdjt\",\"count\":1656349594},{\"complianceState\":\"lbqvgaqvlgafcqu\",\"count\":1673938482}],\"policyGroupDetails\":[{\"complianceState\":\"nwsdtutnwlduyc\",\"count\":903962244},{\"complianceState\":\"yrmewipmvekdx\",\"count\":1124949924},{\"complianceState\":\"gsjj\",\"count\":230921797}]}}],\"policyGroups\":[{\"policyGroupName\":\"ketwzhhzjhfjmhv\",\"results\":{\"queryResultsUri\":\"vgpmun\",\"nonCompliantResources\":425841292,\"nonCompliantPolicies\":1640153211,\"resourceDetails\":[{\"complianceState\":\"buzjyih\",\"count\":1240497337},{\"complianceState\":\"hudypohyuemsl\",\"count\":716160458},{\"complianceState\":\"yrpfoobrlttymsj\",\"count\":221167933},{\"complianceState\":\"dnfwqzdzg\",\"count\":362294520}],\"policyDetails\":[{\"complianceState\":\"nfhqlyvijouwivk\",\"count\":1231243109},{\"complianceState\":\"un\",\"count\":1975908496}],\"policyGroupDetails\":[{\"complianceState\":\"ikvcpwp\",\"count\":1278333608},{\"complianceState\":\"civtsoxfrkenxp\",\"count\":1600333305},{\"complianceState\":\"frpmpdnqqskaw\",\"count\":1561642293}]}},{\"policyGroupName\":\"mmbnpqfrtql\",\"results\":{\"queryResultsUri\":\"egnitg\",\"nonCompliantResources\":1378342440,\"nonCompliantPolicies\":1588645186,\"resourceDetails\":[{\"complianceState\":\"rfe\",\"count\":1902509108},{\"complianceState\":\"lzxwhcansy\",\"count\":1504182372},{\"complianceState\":\"hlwigdivbkbxg\",\"count\":1748093072},{\"complianceState\":\"juwasqvdaeyyguxa\",\"count\":411771042}],\"policyDetails\":[{\"complianceState\":\"zbezkgimsidxasic\",\"count\":424119886},{\"complianceState\":\"vjskgfmoc\",\"count\":1511350596},{\"complianceState\":\"qgatjeaahhvjhhn\",\"count\":1107314593}],\"policyGroupDetails\":[{\"complianceState\":\"jjidjk\",\"count\":905867584},{\"complianceState\":\"yxvxevblbjed\",\"count\":1422208394},{\"complianceState\":\"age\",\"count\":1122513421}]}}]}")
            .toObject(PolicyAssignmentSummary.class);
        Assertions.assertEquals("khocxvdfffwaf", model.policyAssignmentId());
        Assertions.assertEquals("oudaspavehhrvk", model.policySetDefinitionId());
        Assertions.assertEquals("zoz", model.results().queryResultsUri());
        Assertions.assertEquals(83009194, model.results().nonCompliantResources());
        Assertions.assertEquals(529725461, model.results().nonCompliantPolicies());
        Assertions.assertEquals("oyxcdyuib", model.results().resourceDetails().get(0).complianceState());
        Assertions.assertEquals(595382657, model.results().resourceDetails().get(0).count());
        Assertions.assertEquals("kiscvwmzhwpl", model.results().policyDetails().get(0).complianceState());
        Assertions.assertEquals(57384767, model.results().policyDetails().get(0).count());
        Assertions.assertEquals("xdbeesmieknl", model.results().policyGroupDetails().get(0).complianceState());
        Assertions.assertEquals(929981365, model.results().policyGroupDetails().get(0).count());
        Assertions.assertEquals("iagtc", model.policyDefinitions().get(0).policyDefinitionId());
        Assertions.assertEquals("ocqwogfnzjvus", model.policyDefinitions().get(0).policyDefinitionReferenceId());
        Assertions.assertEquals("dmozu", model.policyDefinitions().get(0).policyDefinitionGroupNames().get(0));
        Assertions.assertEquals("lfsbtkadpysow", model.policyDefinitions().get(0).effect());
        Assertions.assertEquals("gkbugrjqct", model.policyDefinitions().get(0).results().queryResultsUri());
        Assertions.assertEquals(1966674078, model.policyDefinitions().get(0).results().nonCompliantResources());
        Assertions.assertEquals(1835646696, model.policyDefinitions().get(0).results().nonCompliantPolicies());
        Assertions.assertEquals("ieypef",
            model.policyDefinitions().get(0).results().resourceDetails().get(0).complianceState());
        Assertions.assertEquals(1122373558,
            model.policyDefinitions().get(0).results().resourceDetails().get(0).count());
        Assertions.assertEquals("cuplcplcwkhih",
            model.policyDefinitions().get(0).results().policyDetails().get(0).complianceState());
        Assertions.assertEquals(184216647, model.policyDefinitions().get(0).results().policyDetails().get(0).count());
        Assertions.assertEquals("sqtzbsrg",
            model.policyDefinitions().get(0).results().policyGroupDetails().get(0).complianceState());
        Assertions.assertEquals(1998399653,
            model.policyDefinitions().get(0).results().policyGroupDetails().get(0).count());
        Assertions.assertEquals("ketwzhhzjhfjmhv", model.policyGroups().get(0).policyGroupName());
        Assertions.assertEquals("vgpmun", model.policyGroups().get(0).results().queryResultsUri());
        Assertions.assertEquals(425841292, model.policyGroups().get(0).results().nonCompliantResources());
        Assertions.assertEquals(1640153211, model.policyGroups().get(0).results().nonCompliantPolicies());
        Assertions.assertEquals("buzjyih",
            model.policyGroups().get(0).results().resourceDetails().get(0).complianceState());
        Assertions.assertEquals(1240497337, model.policyGroups().get(0).results().resourceDetails().get(0).count());
        Assertions.assertEquals("nfhqlyvijouwivk",
            model.policyGroups().get(0).results().policyDetails().get(0).complianceState());
        Assertions.assertEquals(1231243109, model.policyGroups().get(0).results().policyDetails().get(0).count());
        Assertions.assertEquals("ikvcpwp",
            model.policyGroups().get(0).results().policyGroupDetails().get(0).complianceState());
        Assertions.assertEquals(1278333608, model.policyGroups().get(0).results().policyGroupDetails().get(0).count());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PolicyAssignmentSummary model = new PolicyAssignmentSummary().withPolicyAssignmentId("khocxvdfffwaf")
            .withPolicySetDefinitionId("oudaspavehhrvk")
            .withResults(new SummaryResults().withQueryResultsUri("zoz")
                .withNonCompliantResources(83009194)
                .withNonCompliantPolicies(529725461)
                .withResourceDetails(
                    Arrays.asList(new ComplianceDetail().withComplianceState("oyxcdyuib").withCount(595382657),
                        new ComplianceDetail().withComplianceState("nbzydvfvfcj").withCount(640278837),
                        new ComplianceDetail().withComplianceState("isrvhm").withCount(144501476)))
                .withPolicyDetails(
                    Arrays.asList(new ComplianceDetail().withComplianceState("kiscvwmzhwpl").withCount(57384767),
                        new ComplianceDetail().withComplianceState("vxilcbt").withCount(896173123),
                        new ComplianceDetail().withComplianceState("zeyqxtjjfzqlqhyc").withCount(1332514758)))
                .withPolicyGroupDetails(
                    Arrays.asList(new ComplianceDetail().withComplianceState("xdbeesmieknl").withCount(929981365),
                        new ComplianceDetail().withComplianceState("aawiuagydwqfb").withCount(293972975))))
            .withPolicyDefinitions(
                Arrays.asList(
                    new PolicyDefinitionSummary().withPolicyDefinitionId("iagtc")
                        .withPolicyDefinitionReferenceId("ocqwogfnzjvus")
                        .withPolicyDefinitionGroupNames(Arrays.asList("dmozu"))
                        .withEffect("lfsbtkadpysow")
                        .withResults(new SummaryResults().withQueryResultsUri("gkbugrjqct")
                            .withNonCompliantResources(1966674078)
                            .withNonCompliantPolicies(1835646696)
                            .withResourceDetails(Arrays
                                .asList(new ComplianceDetail().withComplianceState("ieypef").withCount(1122373558)))
                            .withPolicyDetails(Arrays.asList(
                                new ComplianceDetail().withComplianceState("cuplcplcwkhih").withCount(184216647)))
                            .withPolicyGroupDetails(Arrays.asList(
                                new ComplianceDetail().withComplianceState("sqtzbsrg").withCount(1998399653),
                                new ComplianceDetail().withComplianceState("jhf").withCount(1635200760),
                                new ComplianceDetail().withComplianceState("cact").withCount(1291421637),
                                new ComplianceDetail().withComplianceState("teyowclu").withCount(1896348924)))),
                    new PolicyDefinitionSummary().withPolicyDefinitionId("kqvgqouw")
                        .withPolicyDefinitionReferenceId("zmpjwyiv")
                        .withPolicyDefinitionGroupNames(Arrays.asList("f", "cvhrfsp", "uagrttikteusqc"))
                        .withEffect("vyklxuby")
                        .withResults(new SummaryResults().withQueryResultsUri("fmmfblcqcu")
                            .withNonCompliantResources(1353373611)
                            .withNonCompliantPolicies(1215063805)
                            .withResourceDetails(
                                Arrays.asList(new ComplianceDetail().withComplianceState("a").withCount(1749229509),
                                    new ComplianceDetail().withComplianceState("ttwgdsl").withCount(1446225762)))
                            .withPolicyDetails(
                                Arrays.asList(new ComplianceDetail().withComplianceState("moo").withCount(806728338),
                                    new ComplianceDetail().withComplianceState("eypxiutcxapzhyr").withCount(290691580)))
                            .withPolicyGroupDetails(Arrays
                                .asList(new ComplianceDetail().withComplianceState("bjoxs").withCount(721490758)))),
                    new PolicyDefinitionSummary().withPolicyDefinitionId("hlabrq")
                        .withPolicyDefinitionReferenceId("kzjcjbtrgae")
                        .withPolicyDefinitionGroupNames(Arrays.asList("ib"))
                        .withEffect("jj")
                        .withResults(
                            new SummaryResults().withQueryResultsUri("qbeitpkxztmoob")
                                .withNonCompliantResources(358908286)
                                .withNonCompliantPolicies(1257381047)
                                .withResourceDetails(Arrays.asList(
                                    new ComplianceDetail().withComplianceState("cwq").withCount(817120127),
                                    new ComplianceDetail().withComplianceState("aqxzhemjyho").withCount(633481749),
                                    new ComplianceDetail().withComplianceState("wtwko").withCount(2040452335),
                                    new ComplianceDetail().withComplianceState("ulkb").withCount(1523794500)))
                                .withPolicyDetails(Arrays.asList(
                                    new ComplianceDetail().withComplianceState("njwltlwtjjgu").withCount(1983301203),
                                    new ComplianceDetail().withComplianceState("hsnvkcdmxzrp").withCount(1098344029),
                                    new ComplianceDetail().withComplianceState("lnwiaaomylwe").withCount(835106090)))
                                .withPolicyGroupDetails(Arrays.asList(
                                    new ComplianceDetail().withComplianceState("ethwwnpjhlfz").withCount(1188676468)))),
                    new PolicyDefinitionSummary().withPolicyDefinitionId("hwahfbousn")
                        .withPolicyDefinitionReferenceId("pgfewetwlyx")
                        .withPolicyDefinitionGroupNames(Arrays.asList("xykxhdj"))
                        .withEffect("immbcx")
                        .withResults(new SummaryResults().withQueryResultsUri("cporxvxcjz")
                            .withNonCompliantResources(1650285397)
                            .withNonCompliantPolicies(546914966)
                            .withResourceDetails(Arrays.asList(
                                new ComplianceDetail().withComplianceState("tgqscjavftjuh").withCount(360904293),
                                new ComplianceDetail().withComplianceState("k").withCount(308398935),
                                new ComplianceDetail().withComplianceState("uwpijr").withCount(1348420027)))
                            .withPolicyDetails(Arrays.asList(
                                new ComplianceDetail().withComplianceState("mghfcfiwrxgkne").withCount(942321971),
                                new ComplianceDetail().withComplianceState("nzqodfvpg").withCount(1507856575),
                                new ComplianceDetail().withComplianceState("gsgbpfgzdjt").withCount(1656349594),
                                new ComplianceDetail().withComplianceState("lbqvgaqvlgafcqu").withCount(1673938482)))
                            .withPolicyGroupDetails(Arrays.asList(
                                new ComplianceDetail().withComplianceState("nwsdtutnwlduyc").withCount(903962244),
                                new ComplianceDetail().withComplianceState("yrmewipmvekdx").withCount(1124949924),
                                new ComplianceDetail().withComplianceState("gsjj").withCount(230921797))))))
            .withPolicyGroups(
                Arrays.asList(
                    new PolicyGroupSummary().withPolicyGroupName("ketwzhhzjhfjmhv")
                        .withResults(new SummaryResults().withQueryResultsUri("vgpmun")
                            .withNonCompliantResources(425841292)
                            .withNonCompliantPolicies(1640153211)
                            .withResourceDetails(Arrays.asList(
                                new ComplianceDetail().withComplianceState("buzjyih").withCount(1240497337),
                                new ComplianceDetail().withComplianceState("hudypohyuemsl").withCount(716160458),
                                new ComplianceDetail().withComplianceState("yrpfoobrlttymsj").withCount(221167933),
                                new ComplianceDetail().withComplianceState("dnfwqzdzg").withCount(362294520)))
                            .withPolicyDetails(Arrays.asList(
                                new ComplianceDetail().withComplianceState("nfhqlyvijouwivk").withCount(1231243109),
                                new ComplianceDetail().withComplianceState("un").withCount(1975908496)))
                            .withPolicyGroupDetails(Arrays.asList(
                                new ComplianceDetail().withComplianceState("ikvcpwp").withCount(1278333608),
                                new ComplianceDetail().withComplianceState("civtsoxfrkenxp")
                                    .withCount(1600333305),
                                new ComplianceDetail().withComplianceState("frpmpdnqqskaw").withCount(1561642293)))),
                    new PolicyGroupSummary().withPolicyGroupName("mmbnpqfrtql")
                        .withResults(
                            new SummaryResults().withQueryResultsUri("egnitg")
                                .withNonCompliantResources(1378342440)
                                .withNonCompliantPolicies(1588645186)
                                .withResourceDetails(Arrays.asList(
                                    new ComplianceDetail().withComplianceState("rfe").withCount(1902509108),
                                    new ComplianceDetail().withComplianceState("lzxwhcansy").withCount(1504182372),
                                    new ComplianceDetail().withComplianceState("hlwigdivbkbxg").withCount(1748093072),
                                    new ComplianceDetail().withComplianceState("juwasqvdaeyyguxa")
                                        .withCount(411771042)))
                                .withPolicyDetails(Arrays.asList(
                                    new ComplianceDetail().withComplianceState("zbezkgimsidxasic").withCount(424119886),
                                    new ComplianceDetail().withComplianceState("vjskgfmoc").withCount(1511350596),
                                    new ComplianceDetail().withComplianceState("qgatjeaahhvjhhn")
                                        .withCount(1107314593)))
                                .withPolicyGroupDetails(Arrays.asList(
                                    new ComplianceDetail().withComplianceState("jjidjk").withCount(905867584),
                                    new ComplianceDetail().withComplianceState("yxvxevblbjed").withCount(1422208394),
                                    new ComplianceDetail().withComplianceState("age").withCount(1122513421))))));
        model = BinaryData.fromObject(model).toObject(PolicyAssignmentSummary.class);
        Assertions.assertEquals("khocxvdfffwaf", model.policyAssignmentId());
        Assertions.assertEquals("oudaspavehhrvk", model.policySetDefinitionId());
        Assertions.assertEquals("zoz", model.results().queryResultsUri());
        Assertions.assertEquals(83009194, model.results().nonCompliantResources());
        Assertions.assertEquals(529725461, model.results().nonCompliantPolicies());
        Assertions.assertEquals("oyxcdyuib", model.results().resourceDetails().get(0).complianceState());
        Assertions.assertEquals(595382657, model.results().resourceDetails().get(0).count());
        Assertions.assertEquals("kiscvwmzhwpl", model.results().policyDetails().get(0).complianceState());
        Assertions.assertEquals(57384767, model.results().policyDetails().get(0).count());
        Assertions.assertEquals("xdbeesmieknl", model.results().policyGroupDetails().get(0).complianceState());
        Assertions.assertEquals(929981365, model.results().policyGroupDetails().get(0).count());
        Assertions.assertEquals("iagtc", model.policyDefinitions().get(0).policyDefinitionId());
        Assertions.assertEquals("ocqwogfnzjvus", model.policyDefinitions().get(0).policyDefinitionReferenceId());
        Assertions.assertEquals("dmozu", model.policyDefinitions().get(0).policyDefinitionGroupNames().get(0));
        Assertions.assertEquals("lfsbtkadpysow", model.policyDefinitions().get(0).effect());
        Assertions.assertEquals("gkbugrjqct", model.policyDefinitions().get(0).results().queryResultsUri());
        Assertions.assertEquals(1966674078, model.policyDefinitions().get(0).results().nonCompliantResources());
        Assertions.assertEquals(1835646696, model.policyDefinitions().get(0).results().nonCompliantPolicies());
        Assertions.assertEquals("ieypef",
            model.policyDefinitions().get(0).results().resourceDetails().get(0).complianceState());
        Assertions.assertEquals(1122373558,
            model.policyDefinitions().get(0).results().resourceDetails().get(0).count());
        Assertions.assertEquals("cuplcplcwkhih",
            model.policyDefinitions().get(0).results().policyDetails().get(0).complianceState());
        Assertions.assertEquals(184216647, model.policyDefinitions().get(0).results().policyDetails().get(0).count());
        Assertions.assertEquals("sqtzbsrg",
            model.policyDefinitions().get(0).results().policyGroupDetails().get(0).complianceState());
        Assertions.assertEquals(1998399653,
            model.policyDefinitions().get(0).results().policyGroupDetails().get(0).count());
        Assertions.assertEquals("ketwzhhzjhfjmhv", model.policyGroups().get(0).policyGroupName());
        Assertions.assertEquals("vgpmun", model.policyGroups().get(0).results().queryResultsUri());
        Assertions.assertEquals(425841292, model.policyGroups().get(0).results().nonCompliantResources());
        Assertions.assertEquals(1640153211, model.policyGroups().get(0).results().nonCompliantPolicies());
        Assertions.assertEquals("buzjyih",
            model.policyGroups().get(0).results().resourceDetails().get(0).complianceState());
        Assertions.assertEquals(1240497337, model.policyGroups().get(0).results().resourceDetails().get(0).count());
        Assertions.assertEquals("nfhqlyvijouwivk",
            model.policyGroups().get(0).results().policyDetails().get(0).complianceState());
        Assertions.assertEquals(1231243109, model.policyGroups().get(0).results().policyDetails().get(0).count());
        Assertions.assertEquals("ikvcpwp",
            model.policyGroups().get(0).results().policyGroupDetails().get(0).complianceState());
        Assertions.assertEquals(1278333608, model.policyGroups().get(0).results().policyGroupDetails().get(0).count());
    }
}
