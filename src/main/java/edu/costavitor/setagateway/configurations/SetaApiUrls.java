package edu.costavitor.setagateway.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetaApiUrls {

    public static String SETA_NOTIFICATION_API_URL;

    @Value("${seta.urls.seta-notification-api-url}")
    void setSetaNotificationApiUrl(String setaNotificationApiUrl) { SETA_NOTIFICATION_API_URL = setaNotificationApiUrl; }
}
