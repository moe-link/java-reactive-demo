package com.doporro.module.user.router.v1;

import com.doporro.module.user.handler.UserHelloHandler;
import jakarta.annotation.Resource;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@RequiredArgsConstructor
public class DemoRouter {

    @NonNull
    private UserHelloHandler userHelloHandler;

    @Bean
    public RouterFunction<ServerResponse> reactorRouterFunction() {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello"), request -> userHelloHandler.hello())
                .andRoute(RequestPredicates.POST("/hello2").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                        userHelloHandler::hello2);
    }

}
