package edu.costavitor.setagateway.routes.feature_importances;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static edu.costavitor.setagateway.configurations.SetaApiUrls.SETA_ANALYSIS_API_URL;

@Configuration
public class GetFeatureImportancesRoute {

    @Bean
    public RouteLocator getFeatureImportancesRouteLocator(RouteLocatorBuilder builder) {

        return builder.routes().route("getFeatureImportances", p -> p
                        .path("/feature-importances")
                        .uri(SETA_ANALYSIS_API_URL))
                .build();
    }
}