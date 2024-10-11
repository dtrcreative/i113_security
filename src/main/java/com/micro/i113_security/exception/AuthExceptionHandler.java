package com.micro.i113_security.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class AuthExceptionHandler extends ResponseEntityExceptionHandler {

//    @ExceptionHandler(value = {IllegalArgumentException.class, IllegalStateException.class})
//    protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
//        String bodyOfResponse = "This should be application specific";
//        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.CONFLICT, request);
//    }

    @ExceptionHandler(value = {AuthException.class})
    protected ResponseEntity<Object> handleConflict(AuthException ex, WebRequest request) {
        log.warn(ex.getMessage());
        log.warn(ex.getCause().toString());
        log.warn(ex.getLocalizedMessage());
        HttpHeaders headers = new HttpHeaders();
        headers.clearContentHeaders();
        return handleExceptionInternal(ex, ex.getMessage(), headers, ex.getStatus(), request);
    }

    @ExceptionHandler(value = {AuthUserException.class})
    protected ResponseEntity<Object> handleConflict(AuthUserException ex, WebRequest request) {
        log.warn(ex.getMessage());
        log.warn(ex.getCause().toString());
        log.warn(ex.getLocalizedMessage());
        HttpHeaders headers = new HttpHeaders();
        headers.clearContentHeaders();
        return handleExceptionInternal(ex, ex.getMessage(), headers, ex.getStatus(), request);
    }

    @ExceptionHandler(value = {JwtAuthenticationException.class})
    protected ResponseEntity<Object> handleConflict(JwtAuthenticationException ex, WebRequest request) {
        log.warn(ex.getMessage());
        log.warn(ex.getCause().toString());
        log.warn(ex.getLocalizedMessage());
        HttpHeaders headers = new HttpHeaders();
        headers.clearContentHeaders();
        return handleExceptionInternal(ex, ex.getMessage(), headers, ex.getHttpStatus(), request);
    }

    @ExceptionHandler(value = {RuntimeException.class})
    protected ResponseEntity<Object> handleConflict(RuntimeException re, WebRequest request) {
        log.warn(re.getMessage());
        log.warn(re.getCause().toString());
        log.warn(re.getLocalizedMessage());
        HttpHeaders headers = new HttpHeaders();
        headers.clearContentHeaders();
        return handleExceptionInternal(re, re.getMessage(), headers, HttpStatus.CONFLICT, request);
    }

}