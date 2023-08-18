package com.doporro.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableAsync
public class AsyncConfig implements WebFluxConfigurer {
}
