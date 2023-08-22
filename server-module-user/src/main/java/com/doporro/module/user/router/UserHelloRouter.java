package com.doporro.module.user.router;

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
public class UserHelloRouter {

    private static final String PATH = "/user/hello";

    @NonNull
    private UserHelloHandler userHelloHandler;

    @Bean
    public RouterFunction<ServerResponse> RouterFunctionUserHello() {
        return RouterFunctions.nest(RequestPredicates.path(PATH), RouterFunctions.route()
                .GET("/", request -> userHelloHandler.hello())
                .POST("/demo", RequestPredicates.accept(MediaType.APPLICATION_JSON), request -> userHelloHandler.demo(request))
                .build()
        );

    }

}
