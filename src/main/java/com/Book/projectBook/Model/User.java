package com.Book.projectBook.Model;

import org.springframework.lang.NonNull;

public class User {

    private String name;
    private String lastname;
    private String email;
    private int documentNumber;

    public User(String name, String lastname, String email, int documentNumber) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }
}
