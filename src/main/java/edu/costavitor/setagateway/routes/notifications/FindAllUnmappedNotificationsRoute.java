package edu.costavitor.setagateway.routes.notifications;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import static edu.costavitor.setagateway.configurations.SetaApiUrls.SETA_NOTIFICATION_API_URL;

@Configuration
public class FindAllUnmappedNotificationsRoute {

    @Bean
    public RouteLocator findAllUnmappedNotificationsRouteLocator(RouteLocatorBuilder builder) {

        return builder.routes().route("findAllUnmappedNotifications", p -> p
                        .path("/notifications")
                        .and().query("returnUnmappedNotificationsOnly")
                        .and().method(HttpMethod.GET)
                        .uri(SETA_NOTIFICATION_API_URL))
                .build();
    }
}
