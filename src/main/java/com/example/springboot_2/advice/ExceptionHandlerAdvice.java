package com.example.springboot_2.advice;

import com.example.springboot_2.exceptions.InvalidCredentials;
import com.example.springboot_2.exceptions.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> invalidCredentialsHandler(InvalidCredentials e) {
        return new ResponseEntity<>(String.valueOf(e), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> unauthorizedUserHandler(UnauthorizedUser e) {
        System.out.println("[ERROR]: " + e);
        return new ResponseEntity<>(String.valueOf(e), HttpStatus.BAD_REQUEST);
    }
}
