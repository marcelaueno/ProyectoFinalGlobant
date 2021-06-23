package com.Book.projectBook.Exception;



public class ExceptionBookExists extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExceptionBookExists(String msg) {
        super(msg);
    }

    public ExceptionBookExists() {

    }
}


