package com.doporro.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(
        scanBasePackages = {"com.doporro.base", "com.doporro.module", "com.doporro.core"}
)
public class Application  {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(Application.class).run(args);
    }

}
