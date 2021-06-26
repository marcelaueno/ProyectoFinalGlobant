package com.Book.projectBook.Exception;



public class ExceptionBookExists extends RuntimeException{

    public ExceptionBookExists (String message) { super(message); }
    public ExceptionBookExists (String message, Throwable cause) { super(message, cause);}

}




