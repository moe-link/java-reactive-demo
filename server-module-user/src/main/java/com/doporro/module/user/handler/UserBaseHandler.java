package com.doporro.module.user.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import reactor.core.publisher.MonoSink;

@Component
@RequiredArgsConstructor
public class UserBaseHandler {

    /**
     * 创建用户
     *
     * @return Mono<ServerResponse>
     */
    public Mono<ServerResponse> createUser(ServerRequest serverRequest) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.create(MonoSink::success), SecurityProperties.User.class);
    }

    /**
     * 删除用户
     *
     * @return Mono<ServerResponse>
     */
    public Mono<ServerResponse> deleteUser() {
        return ServerResponse.ok().build();
    }

}
