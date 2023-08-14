package com.doporro.core.filter;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AuthFilter implements WebFilter {

    private static final String FILTERED_FLAG = "filtered";

    @Override
    public @NonNull Mono<Void> filter(@NonNull ServerWebExchange exchange, @NonNull WebFilterChain chain) {
        // 检查是否已经过滤过请求
        if (null != exchange.getAttribute(FILTERED_FLAG)) {
            // 请求已经被过滤过，直接放行
            return chain.filter(exchange);
        }
        // 执行过滤逻辑
        // ...
        // 标记请求已被过滤
        exchange.getAttributes().put(FILTERED_FLAG, true);
        // 继续处理请求
        return chain.filter(exchange);
    }
}
