package com.Book.projectBook.Exception;


import com.Book.projectBook.Model.Book;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;



@ControllerAdvice
public class RestExceptionHandler  {

    @ExceptionHandler(ExceptionBookExists.class)
    @ResponseBody
    public ResponseEntity<String> ExceptionBookExists(ExceptionBookExists e) {
        String bodyJson = "{\"ErrorMessage\":\"This book already exists\"}";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.TEXT_PLAIN).body(bodyJson);
    }
    }








