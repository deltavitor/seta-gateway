package edu.costavitor.setagateway.routes.notification_locations;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import static edu.costavitor.setagateway.configurations.SetaApiUrls.SETA_NOTIFICATION_API_URL;

@Configuration
public class DeleteAllNotificationLocationsRoute {

    @Bean
    public RouteLocator deleteAllNotificationLocationsRouteLocator(RouteLocatorBuilder builder) {

        return builder.routes().route("deleteAllNotificationLocations", p -> p
                        .path("/notification-locations")
                        .and().method(HttpMethod.DELETE)
                        .or().method(HttpMethod.OPTIONS)
                        .uri(SETA_NOTIFICATION_API_URL))
                .build();
    }
}
