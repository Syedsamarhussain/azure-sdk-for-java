// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ScheduleTriggerTypeProperties;
import com.azure.resourcemanager.datafactory.models.DayOfWeek;
import com.azure.resourcemanager.datafactory.models.DaysOfWeek;
import com.azure.resourcemanager.datafactory.models.RecurrenceFrequency;
import com.azure.resourcemanager.datafactory.models.RecurrenceSchedule;
import com.azure.resourcemanager.datafactory.models.RecurrenceScheduleOccurrence;
import com.azure.resourcemanager.datafactory.models.ScheduleTriggerRecurrence;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScheduleTriggerTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleTriggerTypeProperties model = BinaryData.fromString(
            "{\"recurrence\":{\"frequency\":\"Week\",\"interval\":1320814252,\"startTime\":\"2021-03-10T17:47:55Z\",\"endTime\":\"2021-04-17T10:32:31Z\",\"timeZone\":\"w\",\"schedule\":{\"minutes\":[1617858361],\"hours\":[653605955],\"weekDays\":[\"Wednesday\",\"Saturday\",\"Thursday\",\"Saturday\"],\"monthDays\":[1144219681,1904876430,794780703,1779734438],\"monthlyOccurrences\":[{\"day\":\"Friday\",\"occurrence\":1553291833,\"\":{\"pmvppg\":\"datauvshguu\",\"vafbdzokplolcal\":\"dataiyo\",\"tdqsqb\":\"datavcxvcpxdeqntb\",\"spzwa\":\"dataubswzafqrmwdofg\"}},{\"day\":\"Tuesday\",\"occurrence\":851506626,\"\":{\"nvhtrfckrm\":\"datacdjvlwczwdkkscoo\",\"ghjsxpptsvppf\":\"databaoidtfmpcbvko\",\"scgzqncd\":\"datanihxcijftsbpvy\"}},{\"day\":\"Thursday\",\"occurrence\":1309388141,\"\":{\"rohfv\":\"datayi\",\"nkkztjmqjrh\":\"datagjnexdlsangl\"}}],\"\":{\"ozwnpuyhqaylsmeh\":\"dataajyrhrywucpdzbnt\",\"efofujzwqpkhgr\":\"datazplzrrhabbdq\",\"qkv\":\"datagyiloe\",\"aoetrglpaocq\":\"datafnphbzs\"}},\"\":{\"vuhagoqxfxje\":\"dataleou\",\"hrymeynbiwowu\":\"datauoquacrdn\",\"rnwkt\":\"datakiocjn\"}}}")
            .toObject(ScheduleTriggerTypeProperties.class);
        Assertions.assertEquals(RecurrenceFrequency.WEEK, model.recurrence().frequency());
        Assertions.assertEquals(1320814252, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-10T17:47:55Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-17T10:32:31Z"), model.recurrence().endTime());
        Assertions.assertEquals("w", model.recurrence().timeZone());
        Assertions.assertEquals(1617858361, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(653605955, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.WEDNESDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(1144219681, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(1553291833, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleTriggerTypeProperties model = new ScheduleTriggerTypeProperties()
            .withRecurrence(new ScheduleTriggerRecurrence().withFrequency(RecurrenceFrequency.WEEK)
                .withInterval(1320814252)
                .withStartTime(OffsetDateTime.parse("2021-03-10T17:47:55Z"))
                .withEndTime(OffsetDateTime.parse("2021-04-17T10:32:31Z"))
                .withTimeZone("w")
                .withSchedule(new RecurrenceSchedule().withMinutes(Arrays.asList(1617858361))
                    .withHours(Arrays.asList(653605955))
                    .withWeekDays(Arrays.asList(DaysOfWeek.WEDNESDAY, DaysOfWeek.SATURDAY, DaysOfWeek.THURSDAY,
                        DaysOfWeek.SATURDAY))
                    .withMonthDays(Arrays.asList(1144219681, 1904876430, 794780703, 1779734438))
                    .withMonthlyOccurrences(Arrays.asList(
                        new RecurrenceScheduleOccurrence().withDay(DayOfWeek.FRIDAY)
                            .withOccurrence(1553291833)
                            .withAdditionalProperties(mapOf()),
                        new RecurrenceScheduleOccurrence().withDay(DayOfWeek.TUESDAY)
                            .withOccurrence(851506626)
                            .withAdditionalProperties(mapOf()),
                        new RecurrenceScheduleOccurrence().withDay(DayOfWeek.THURSDAY)
                            .withOccurrence(1309388141)
                            .withAdditionalProperties(mapOf())))
                    .withAdditionalProperties(mapOf()))
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(ScheduleTriggerTypeProperties.class);
        Assertions.assertEquals(RecurrenceFrequency.WEEK, model.recurrence().frequency());
        Assertions.assertEquals(1320814252, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-10T17:47:55Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-17T10:32:31Z"), model.recurrence().endTime());
        Assertions.assertEquals("w", model.recurrence().timeZone());
        Assertions.assertEquals(1617858361, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(653605955, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.WEDNESDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(1144219681, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(1553291833, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
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
