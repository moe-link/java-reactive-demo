package com.doporro.core.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableCaching
public class CacheConfig implements WebFluxConfigurer {
}
