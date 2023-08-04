package com.doporro.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.r2dbc.R2dbcDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(
        scanBasePackages = {"com.doporro.module", "com.doporro.core"},
        exclude = {R2dbcAutoConfiguration.class, R2dbcDataAutoConfiguration.class}
)
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder().run(args);
    }

}
