package edu.costavitor.setagateway.routes.predictions;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import static edu.costavitor.setagateway.configurations.SetaApiUrls.SETA_ANALYSIS_API_URL;

@Configuration
public class PredictRoute {

    @Bean
    public RouteLocator predictRouteLocator(RouteLocatorBuilder builder) {

        return builder.routes().route("predict", p -> p
                        .path("/predict")
                        .uri(SETA_ANALYSIS_API_URL))
                .build();
    }
}