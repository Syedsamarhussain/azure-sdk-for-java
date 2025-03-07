// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SnowflakeImportCopyCommand;
import com.azure.resourcemanager.datafactory.models.SnowflakeV2Sink;
import java.util.HashMap;
import java.util.Map;

public final class SnowflakeV2SinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnowflakeV2Sink model = BinaryData.fromString(
            "{\"type\":\"SnowflakeV2Sink\",\"preCopyScript\":\"datalethe\",\"importSettings\":{\"type\":\"SnowflakeImportCopyCommand\",\"additionalCopyOptions\":{\"onsvjc\":\"dataamtvooaacef\",\"ywi\":\"dataytytyrvtuxv\",\"kfqznvahpxdg\":\"datammmgbynvoytdt\"},\"additionalFormatOptions\":{\"aztoias\":\"datawxcptxvxfwwvmygc\",\"camgjyt\":\"datajri\",\"bmnxpmoadjoo\":\"datakttit\",\"bpuoycawptxq\":\"datarnzlzzmygoutq\"},\"storageIntegration\":\"dataufdxpwj\",\"\":{\"cuk\":\"datavskpbuoc\",\"cepp\":\"datatcuvwwfgjjcaa\"}},\"writeBatchSize\":\"datailyxpqxnlifhjym\",\"writeBatchTimeout\":\"datajliivyatyzwy\",\"sinkRetryCount\":\"dataaycjphozymcypdbu\",\"sinkRetryWait\":\"datanktlzngidgwsc\",\"maxConcurrentConnections\":\"datamhgzapcgdk\",\"disableMetricsCollection\":\"dataa\",\"\":{\"bbyoudct\":\"datapohlfvsbaqdgzb\",\"muomdl\":\"datalkucxtyufsouhkmc\",\"lxoxwndfuyj\":\"datapsbgxpnygroqia\"}}")
            .toObject(SnowflakeV2Sink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnowflakeV2Sink model = new SnowflakeV2Sink().withWriteBatchSize("datailyxpqxnlifhjym")
            .withWriteBatchTimeout("datajliivyatyzwy")
            .withSinkRetryCount("dataaycjphozymcypdbu")
            .withSinkRetryWait("datanktlzngidgwsc")
            .withMaxConcurrentConnections("datamhgzapcgdk")
            .withDisableMetricsCollection("dataa")
            .withPreCopyScript("datalethe")
            .withImportSettings(new SnowflakeImportCopyCommand()
                .withAdditionalCopyOptions(
                    mapOf("onsvjc", "dataamtvooaacef", "ywi", "dataytytyrvtuxv", "kfqznvahpxdg", "datammmgbynvoytdt"))
                .withAdditionalFormatOptions(mapOf("aztoias", "datawxcptxvxfwwvmygc", "camgjyt", "datajri",
                    "bmnxpmoadjoo", "datakttit", "bpuoycawptxq", "datarnzlzzmygoutq"))
                .withStorageIntegration("dataufdxpwj"));
        model = BinaryData.fromObject(model).toObject(SnowflakeV2Sink.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
