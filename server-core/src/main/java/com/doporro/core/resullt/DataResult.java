package com.doporro.core.resullt;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor(staticName = "create")
@SuppressWarnings("unused")
public class DataResult<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer code;
    private String message;
    private T data;
    private LocalDateTime time = LocalDateTime.now();

    private DataResult(Integer code, String message) {
        this.code = code;
        this. message = message;
    }
    private DataResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
