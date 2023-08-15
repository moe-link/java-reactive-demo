package com.doporro.core.handler;

import org.springframework.core.ReactiveAdapterRegistry;
import org.springframework.http.codec.HttpMessageWriter;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.accept.RequestedContentTypeResolver;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityResultHandler;

import java.util.List;

@Component
public class EntityHandler extends ResponseEntityResultHandler {

    public EntityHandler(List<HttpMessageWriter<?>> writers, RequestedContentTypeResolver resolver, ReactiveAdapterRegistry registry) {
        super(writers, resolver, registry);
    }
}
