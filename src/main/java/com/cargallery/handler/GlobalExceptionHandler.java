package com.cargallery.handler;

import com.cargallery.exception.ErrorResponse;
import com.cargallery.exception.FieldErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException ex, HttpServletRequest request) {

        List<FieldErrorResponse> fieldErrorResponseList = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(this::convertFieldError)
                .toList();

        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST,
                "Validation Failed",
                request.getRequestURI(),
                fieldErrorResponseList);


        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorResponse);
    }


    private FieldErrorResponse convertFieldError(FieldError fieldError) {

        return new FieldErrorResponse(fieldError.getField(), fieldError.getRejectedValue(), fieldError.getDefaultMessage());
    }

}
