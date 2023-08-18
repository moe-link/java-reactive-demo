package com.doporro.module.user.route;

import com.doporro.module.user.handler.UserBaseHandler;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

@Configuration
@RequiredArgsConstructor
public class UserBaseRoute {

    @NonNull
    private UserBaseHandler userBaseHandler;

    @Bean
    public RouterFunction<ServerResponse> reactorRouterFunction() {
        return RouterFunctions.nest(
                RequestPredicates.path("user/base").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                RouterFunctions
                        .route(RequestPredicates.GET("/delteUser"), request -> userBaseHandler.deleteUser())
                        .andRoute(RequestPredicates.POST("/createUser"), request -> userBaseHandler.createUser(request)));
    }
}
