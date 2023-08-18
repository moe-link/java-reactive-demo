package com.doporro.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(
        scanBasePackages = {"com.doporro.core", "com.doporro.base", "com.doporro.module"}
)
public class Application  {
    //extends SpringBootServletInitializer

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(Application.class).run(args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(Application.class);
//    }

}
