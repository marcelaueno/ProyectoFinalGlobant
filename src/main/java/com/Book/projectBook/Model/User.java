package com.Book.projectBook.Model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name="idUser")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idUser;
    @Column(name="name", length = 45)
    @NotEmpty
    private String name;
    @Column(name="lastname", length = 45)
    @NotEmpty
    private String lastname;
    @Column(name="email", length = 50,unique = true)
    @NotEmpty @Email
    private String email;
    @Column(name="documentNumber",nullable = false)
    private int documentNumber;

    public User() {
    }

    public User(Long idUser, String name, String lastname, String email, int documentNumber) {
        this.idUser = idUser;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.documentNumber = documentNumber;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUSer) {
        this.idUser = idUser;
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
