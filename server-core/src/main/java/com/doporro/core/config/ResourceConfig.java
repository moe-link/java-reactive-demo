package com.doporro.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import reactor.util.annotation.NonNull;

@Configuration
public class ResourceConfig implements WebFluxConfigurer {

    @Override
    public void addResourceHandlers(@NonNull ResourceHandlerRegistry registry) {
        WebFluxConfigurer.super.addResourceHandlers(registry);
    }
}
