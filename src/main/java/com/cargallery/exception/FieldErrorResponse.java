package com.cargallery.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FieldErrorResponse {

    private String field;
    private Object rejectedValue;
    private String message;

}
