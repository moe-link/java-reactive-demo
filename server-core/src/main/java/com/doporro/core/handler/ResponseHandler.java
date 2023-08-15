package com.doporro.core.handler;

import org.springframework.http.codec.HttpMessageWriter;
import org.springframework.web.reactive.accept.RequestedContentTypeResolver;
import org.springframework.web.reactive.result.method.annotation.ResponseBodyResultHandler;

import java.util.List;

//@Component
public class ResponseHandler extends ResponseBodyResultHandler {

    public ResponseHandler(List<HttpMessageWriter<?>> writers, RequestedContentTypeResolver resolver) {
        super(writers, resolver);
    }




}
