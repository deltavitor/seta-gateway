package edu.costavitor.setagateway.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetaApiUrls {

    public static String SETA_ANALYSIS_API_URL;
    public static String SETA_NOTIFICATION_API_URL;

    @Value("${seta.urls.seta-analysis-api-url}")
    void setSetaAnalysisApiUrl(String setaAnalysisApiUrl) { SETA_ANALYSIS_API_URL = setaAnalysisApiUrl; }

    @Value("${seta.urls.seta-notification-api-url}")
    void setSetaNotificationApiUrl(String setaNotificationApiUrl) { SETA_NOTIFICATION_API_URL = setaNotificationApiUrl; }
}
