package com.doporro.core.handler;

import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.autoconfigure.web.reactive.error.AbstractErrorWebExceptionHandler;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.*;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

@Component
public class ExceptionHandler extends AbstractErrorWebExceptionHandler {

    public ExceptionHandler(
            ErrorAttributes errorAttributes, ApplicationContext applicationContext, ServerCodecConfigurer codecConfigurer
    ) {
        super(errorAttributes, new WebProperties.Resources(), applicationContext);
        this.setMessageWriters(codecConfigurer.getWriters());
    }

    @Override
    protected RouterFunction<ServerResponse> getRoutingFunction(ErrorAttributes errorAttributes) {
        return RouterFunctions.route(RequestPredicates.all(), this::renderErrorResponse);
    }

    private Mono<ServerResponse> renderErrorResponse(ServerRequest request) {
        //错误发生时被处罚
        return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue("An error occurred");
    }

    @Override
    public @NonNull Mono<Void> handle(@NonNull ServerWebExchange exchange, @NonNull Throwable ex) {
        // 异常处理逻辑
        return Mono.error(ex); // 或者返回一个自定义的响应
    }
}
