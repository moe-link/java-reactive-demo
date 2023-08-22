package com.doporro.module.user.handler;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserHelloHandler {

    public @NonNull Mono<ServerResponse>
    hello() {
        Mono<String> hello = Mono.fromSupplier(()-> "hello");
        return ServerResponse.ok().body(hello, String.class);
    }

    public @NonNull Mono<ServerResponse> demo(ServerRequest request) {
        List<String> list = new ArrayList<>();
        Flux<String> hello2 = Flux.fromIterable(list);
        return ServerResponse.ok().body(hello2, String.class);
    }

}
