package com.Book.projectBook.Service;

import com.Book.projectBook.Model.User;
import com.Book.projectBook.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceInterface{

    @Autowired
    private UserRepository userRepository;



    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getIdUser());
        User updateUser = optionalUser.get();
        updateUser.setName(user.getName());
        updateUser.setLastname(user.getLastname());
        updateUser.setEmail(user.getEmail());
        updateUser.setDocumentNumber(user.getDocumentNumber());

        return  userRepository.save(updateUser);    }

    @Override
    public String deleteUserById(Long idUser) {
        userRepository.deleteById(idUser);
        return "User removed"+ idUser;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> listUser() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(User user) {
        return userRepository.findById(user.getIdUser());
    }
}
