package com.doporro.core.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@SuppressWarnings("unused")
public class BusinessException extends RuntimeException {

    private final String message;

}
