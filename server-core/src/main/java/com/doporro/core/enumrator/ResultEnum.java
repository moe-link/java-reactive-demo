package com.doporro.core.enumrator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultEnum {

    RESULT_ENUM_SUCCESS(200, "success"),
    RESULT_ENUM_ERROR(500, "error"),
    ;

    private final Integer code;
    private final String message;

}
