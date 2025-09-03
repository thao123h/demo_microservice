package jmaster.io.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayserviceApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder, LoggingGatewayFilterFactory loggingFactory) {
        return builder.routes()

                .route("user-route", r -> r.path("/users/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://user-service"))

                .route("item-route", r -> r.path("/items/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://item-service"))
                .route("booking-route", b -> b.path("/bookings/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://booking-service"))

                ///swagger ui
                .route("openapi", r -> r.path("/v3/api-docs/**")
                        .filters(f -> f.rewritePath("/v3/api-docs/(?<service>.*)", "/${service}/v3/api-docs"))
                        .uri("lb://gateway-service"))

                .build();
    }
}
