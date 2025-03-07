// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.resourcemanager.workloads.models.DB2ProviderInstanceProperties;
import com.azure.resourcemanager.workloads.models.HanaDbProviderInstanceProperties;
import com.azure.resourcemanager.workloads.models.MsSqlServerProviderInstanceProperties;
import com.azure.resourcemanager.workloads.models.PrometheusHaClusterProviderInstanceProperties;
import com.azure.resourcemanager.workloads.models.PrometheusOSProviderInstanceProperties;
import com.azure.resourcemanager.workloads.models.SapNetWeaverProviderInstanceProperties;
import com.azure.resourcemanager.workloads.models.SslPreference;
import java.util.Arrays;

/**
 * Samples for ProviderInstances Create.
 */
public final class ProviderInstancesCreateSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * MsSqlServerProviderInstance_Create.json
     */
    /**
     * Sample code: Create a MsSqlServer provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAMsSqlServerProvider(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new MsSqlServerProviderInstanceProperties().withHostname("hostname")
                .withDbPort("5912")
                .withDbUsername("user")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSapSid("sid")
                .withSslPreference(SslPreference.SERVER_CERTIFICATE)
                .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * Db2ProviderInstances_Create_Root_Certificate.json
     */
    /**
     * Sample code: Create a Db2 provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        createADb2ProviderWithRootCertificate(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new DB2ProviderInstanceProperties().withHostname("hostname")
                .withDbName("dbName")
                .withDbPort("dbPort")
                .withDbUsername("username")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSapSid("SID")
                .withSslPreference(SslPreference.ROOT_CERTIFICATE))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * ProviderInstances_Create.json
     */
    /**
     * Sample code: Create a SAP monitor Hana provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createASAPMonitorHanaProvider(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new HanaDbProviderInstanceProperties().withHostname("name")
                .withDbName("db")
                .withSqlPort("0000")
                .withInstanceNumber("00")
                .withDbUsername("user")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename")
                .withSslHostnameInCertificate("xyz.domain.com")
                .withSslPreference(SslPreference.SERVER_CERTIFICATE)
                .withSapSid("SID"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * NetWeaverProviderInstances_Create_Root_Certificate.json
     */
    /**
     * Sample code: Create a SAP monitor NetWeaver provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createASAPMonitorNetWeaverProviderWithRootCertificate(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new SapNetWeaverProviderInstanceProperties().withSapSid("SID")
                .withSapHostname("name")
                .withSapInstanceNr("00")
                .withSapHostFileEntries(Arrays.asList("127.0.0.1 name fqdn"))
                .withSapUsername("username")
                .withSapPassword("fakeTokenPlaceholder")
                .withSapPasswordUri("fakeTokenPlaceholder")
                .withSapClientId("111")
                .withSapPortNumber("1234")
                .withSslPreference(SslPreference.ROOT_CERTIFICATE))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * MsSqlServerProviderInstance_Create_Root_Certificate.json
     */
    /**
     * Sample code: Create a MsSqlServer provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        createAMsSqlServerProviderWithRootCertificate(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new MsSqlServerProviderInstanceProperties().withHostname("hostname")
                .withDbPort("5912")
                .withDbUsername("user")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSapSid("sid")
                .withSslPreference(SslPreference.ROOT_CERTIFICATE))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * PrometheusHaClusterProviderInstances_Create.json
     */
    /**
     * Sample code: Create a PrometheusHaCluster provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        createAPrometheusHaClusterProvider(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(
                new PrometheusHaClusterProviderInstanceProperties().withPrometheusUrl("http://192.168.0.0:9090/metrics")
                    .withHostname("hostname")
                    .withSid("sid")
                    .withClusterName("clusterName")
                    .withSslPreference(SslPreference.SERVER_CERTIFICATE)
                    .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * PrometheusHaClusterProviderInstances_Create_Root_Certificate.json
     */
    /**
     * Sample code: Create a PrometheusHaCluster provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAPrometheusHaClusterProviderWithRootCertificate(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(
                new PrometheusHaClusterProviderInstanceProperties().withPrometheusUrl("http://192.168.0.0:9090/metrics")
                    .withHostname("hostname")
                    .withSid("sid")
                    .withClusterName("clusterName")
                    .withSslPreference(SslPreference.ROOT_CERTIFICATE))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * Db2ProviderInstances_Create.json
     */
    /**
     * Sample code: Create a Db2 provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createADb2Provider(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new DB2ProviderInstanceProperties().withHostname("hostname")
                .withDbName("dbName")
                .withDbPort("dbPort")
                .withDbUsername("username")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSapSid("SID")
                .withSslPreference(SslPreference.SERVER_CERTIFICATE)
                .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * PrometheusOSProviderInstances_Create_Root_Certificate.json
     */
    /**
     * Sample code: Create a OS provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        createAOSProviderWithRootCertificate(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(
                new PrometheusOSProviderInstanceProperties().withPrometheusUrl("http://192.168.0.0:9090/metrics")
                    .withSslPreference(SslPreference.ROOT_CERTIFICATE)
                    .withSapSid("SID"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * PrometheusOSProviderInstances_Create.json
     */
    /**
     * Sample code: Create a OS provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAOSProvider(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(
                new PrometheusOSProviderInstanceProperties().withPrometheusUrl("http://192.168.0.0:9090/metrics")
                    .withSslPreference(SslPreference.SERVER_CERTIFICATE)
                    .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename")
                    .withSapSid("SID"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * NetWeaverProviderInstances_Create.json
     */
    /**
     * Sample code: Create a SAP monitor NetWeaver provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        createASAPMonitorNetWeaverProvider(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new SapNetWeaverProviderInstanceProperties().withSapSid("SID")
                .withSapHostname("name")
                .withSapInstanceNr("00")
                .withSapHostFileEntries(Arrays.asList("127.0.0.1 name fqdn"))
                .withSapUsername("username")
                .withSapPassword("fakeTokenPlaceholder")
                .withSapPasswordUri("fakeTokenPlaceholder")
                .withSapClientId("111")
                .withSapPortNumber("1234")
                .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename")
                .withSslPreference(SslPreference.SERVER_CERTIFICATE))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * ProviderInstances_Create_Root_Certificate.json
     */
    /**
     * Sample code: Create a SAP monitor Hana provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        createASAPMonitorHanaProviderWithRootCertificate(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new HanaDbProviderInstanceProperties().withHostname("name")
                .withDbName("db")
                .withSqlPort("0000")
                .withInstanceNumber("00")
                .withDbUsername("user")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSslHostnameInCertificate("xyz.domain.com")
                .withSslPreference(SslPreference.ROOT_CERTIFICATE)
                .withSapSid("SID"))
            .create();
    }
}
