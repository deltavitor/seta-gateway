package edu.costavitor.setagateway.routes.notifications;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import static edu.costavitor.setagateway.configurations.SetaApiUrls.SETA_NOTIFICATION_API_URL;

@Configuration
public class FindAllGeocodedNotificationsRoute {

    @Bean
    public RouteLocator findAllGeocodedNotificationsRouteLocator(RouteLocatorBuilder builder) {

        return builder.routes().route("findAllGeocodedNotifications", p -> p
                        .path("/notifications")
                        .and().method(HttpMethod.GET)
                        .and().query("returnGeocodedNotifications")
                        .uri(SETA_NOTIFICATION_API_URL))
                .build();
    }
}
