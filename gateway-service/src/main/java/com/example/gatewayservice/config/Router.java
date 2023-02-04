package com.example.gatewayservice.config;

import lombok.AllArgsConstructor;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@AllArgsConstructor
public class Router {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder){
        return builder.routes()
                .route("client", r->r.path("/api/client/**")
                        .filters(f -> f.rewritePath("/api/client/([?.*])","/${remains}")
                                .addRequestHeader("X-client-Header", "client-service-header"))
                        .uri("lb://CLIENT-SERVICE"))
                .build();
    }
}
