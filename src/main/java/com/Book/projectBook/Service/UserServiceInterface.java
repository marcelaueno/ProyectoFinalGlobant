package com.Book.projectBook.Service;

import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

    public User createUser(User user);

    public User updateUser(User user);

    public String deleteUserById(Long idUser);

    public List<User> listUser();

    public Optional<User> getUserById(User user);
}
