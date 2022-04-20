package com.ringcentral;

import com.ringcentral.definitions.AggregatePerformanceCallsGrouping;
import com.ringcentral.definitions.AggregatePerformanceReportCallsParameters;
import com.ringcentral.definitions.PerformanceCallsAggregatesRequest;
import com.ringcentral.definitions.PerformanceCallsAggregatesResponse;
import com.ringcentral.definitions.PerformanceCallsTimeRange;
import com.ringcentral.definitions.PerformanceCallsTimeSettings;
import com.ringcentral.definitions.PerformanceCallsTimelineRequest;
import com.ringcentral.definitions.TimelinePerformanceCallsGrouping;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AnalyticsTest {
    @Test
    public void testAggregateAPI() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
            System.getenv("RINGCENTRAL_USERNAME"),
            System.getenv("RINGCENTRAL_EXTENSION"),
            System.getenv("RINGCENTRAL_PASSWORD")
        );

        PerformanceCallsTimeRange timeRange = new PerformanceCallsTimeRange();
        timeRange.timeFrom("2021-12-12T08:00:00.000Z");
        timeRange.timeTo("2022-04-19T18:39:00.000Z");
        PerformanceCallsTimeSettings timeSettingsRequest = new PerformanceCallsTimeSettings().timeRange(timeRange);

        AggregatePerformanceCallsGrouping groupingRequest = new AggregatePerformanceCallsGrouping().groupBy("Users");

        
        PerformanceCallsAggregatesRequest perfAggRequest = new PerformanceCallsAggregatesRequest();
        perfAggRequest.grouping(groupingRequest);
        perfAggRequest.timeSettings(timeSettingsRequest);

        long page = 1L;
        AggregatePerformanceReportCallsParameters param = new AggregatePerformanceReportCallsParameters();
        param.page(page);

        PerformanceCallsAggregatesResponse response = rc.analytics().phone().performance().v1().accounts().calls().aggregate().post(perfAggRequest, param);

        assertNotNull(response);

        rc.revoke();
    }

    @Test
    public void testTimelineAPI() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
            System.getenv("RINGCENTRAL_USERNAME"),
            System.getenv("RINGCENTRAL_EXTENSION"),
            System.getenv("RINGCENTRAL_PASSWORD")
        );

        // PerformanceCallsAggregatesRequest performanceCallsAggregatesRequest = new PerformanceCallsAggregatesRequest();
        // AggregatePerformanceReportCallsParameters aggregatePerformanceReportCallsParameters = new AggregatePerformanceReportCallsParameters();
  
        // PerformanceCallsAggregatesResponse result = rc.analytics().phone().performance().v1().accounts().calls().aggregate().post(performanceCallsAggregatesRequest, aggregatePerformanceReportCallsParameters);
        // PerformanceCallsAggregatesResponse response = rc.analytics().phone().performance().v1().accounts().calls().timeline().post(
        //     new PerformanceCallsTimelineRequest(), new TimelinePerformanceCallsGrouping());

        // assertNotNull(response);

        // rc.revoke();
    }
    
}
