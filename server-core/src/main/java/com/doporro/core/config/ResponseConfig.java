package com.doporro.core.config;

import com.doporro.core.handler.ResponseHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.reactive.accept.RequestedContentTypeResolver;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
public class ResponseConfig implements WebFluxConfigurer {

    @Bean
    public ResponseHandler responseHandler(
            ServerCodecConfigurer serverCodecConfigurer, RequestedContentTypeResolver requestedContentTypeResolver
    ) {
        return new ResponseHandler(serverCodecConfigurer.getWriters(), requestedContentTypeResolver);
    }

}
