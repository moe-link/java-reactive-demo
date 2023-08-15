package com.doporro.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(
        scanBasePackages = {"com.doporro.module", "com.doporro.core"}
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
