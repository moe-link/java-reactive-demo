package com.doporro.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig implements WebFluxConfigurer {

    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public SecurityWebFilterChain securityFilterChain(ServerHttpSecurity http) {
        return http.build();
    }

    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public SecurityWebFilterChain authorizationServerSecurityFilterChain(ServerHttpSecurity http) {
        return http.build();
    }


}
