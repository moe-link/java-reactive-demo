package com.doporro.core.advice;

import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebExceptionHandler;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

//@RestControllerAdvice
@Component
public class ExceptionAdvice implements WebExceptionHandler {

//    @ExceptionHandler(Exception.class)
//    public Mono<ResponseEntity<String>> handleException(Exception ex) {
//        // 处理异常逻辑
//        return Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error"));
//    }

    @Override
    public @NonNull Mono<Void> handle(@NonNull ServerWebExchange exchange, @NonNull Throwable ex) {
        // 异常处理逻辑
        return Mono.error(ex); // 或者返回一个自定义的响应
    }
}
