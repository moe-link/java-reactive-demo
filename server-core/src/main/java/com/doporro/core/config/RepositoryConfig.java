package com.doporro.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableR2dbcRepositories(basePackages = "com.doporro.base.repository.postgres")
@EnableReactiveMongoRepositories(basePackages = "com.doporro.base.repository.mongo")
public class RepositoryConfig implements WebFluxConfigurer {
}
