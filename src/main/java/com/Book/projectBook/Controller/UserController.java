package com.Book.projectBook.Controller;

import com.Book.projectBook.Model.User;
import com.Book.projectBook.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="{idUser}")
    public ResponseEntity<User> getUserById(@PathVariable("idUser") Long idUser) {
        Optional<User> optionalUser = userRepository.findById(idUser);
        if (optionalUser.isPresent()) {
            return ResponseEntity.ok(optionalUser.get());
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = userRepository.save(user);
        return ResponseEntity.ok(newUser);
    }

    @DeleteMapping(value="{documentNumber}")
    public ResponseEntity<Void> deleteUser(@PathVariable("documentNumber") Long idUser) {
        userRepository.deleteById(idUser);
        return ResponseEntity.ok(null);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        Optional<User> optionalUser = userRepository.findById(user.getIdUser());
        if (optionalUser.isPresent()) {
            User updateUser = optionalUser.get();
            updateUser.setName(user.getName());
            updateUser.setLastname(user.getLastname());
            updateUser.setDocumentNumber(user.getDocumentNumber());
            updateUser.setEmail(user.getEmail());
            userRepository.save(updateUser);
            return ResponseEntity.ok(updateUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
