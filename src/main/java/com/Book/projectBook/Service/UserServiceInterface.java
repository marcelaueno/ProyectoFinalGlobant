package com.Book.projectBook.Service;

import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

     User createUser(User user);

     User updateUser(User user);

     String deleteUserById(Long idUser);

     List<User> listUser();

     Optional<User> getUserById(User user);
}
