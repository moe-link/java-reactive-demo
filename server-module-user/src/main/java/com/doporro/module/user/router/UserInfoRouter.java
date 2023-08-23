package com.doporro.module.user.router;

import com.doporro.module.user.handler.UserInfoHandler;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

@Configuration
@RequiredArgsConstructor
public class UserInfoRouter {

    private static final String PATH = "/user/base";

    @NonNull
    private UserInfoHandler userInfoHandler;

    @Bean
    public RouterFunction<ServerResponse> reactorRouterFunction1() {
        return RouterFunctions.nest(
                RequestPredicates.path(PATH).and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                RouterFunctions
                        .route(RequestPredicates.GET("/deleteUser"), request -> userInfoHandler.deleteUser())
                        .andRoute(RequestPredicates.POST("/createUser"), request -> userInfoHandler.createUser(request)));
    }
}
