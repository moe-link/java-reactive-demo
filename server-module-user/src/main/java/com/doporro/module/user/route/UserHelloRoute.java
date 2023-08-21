package com.doporro.module.user.route;

import com.doporro.module.user.handler.UserHelloHandler;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration(proxyBeanMethods = false)
@RequiredArgsConstructor
public class UserHelloRoute {

    @NonNull
    private UserHelloHandler userHelloHandler;

    @Bean
    public RouterFunction<ServerResponse> reactorRouterFunction() {
//        return RouterFunctions.route()
//                .GET("/{hello}", RequestPredicates.accept(MediaType.APPLICATION_JSON), userHelloHandler.hello())
//                .build();
        return RouterFunctions
                .route(RequestPredicates.GET("/hello"), request -> userHelloHandler.hello())
                .andRoute(RequestPredicates.POST("/hello2").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                        userHelloHandler::hello2);
    }

}
