package com.Book.projectBook.Controller;

import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.User;
import com.Book.projectBook.Service.BookRepository;
import com.Book.projectBook.Service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="{documentNumber}")
    public ResponseEntity<User> getUserById(@PathVariable("documentNumber") int documentNumber) {
        Optional<User> optionalUser = userRepository.findById(documentNumber);
        if (optionalUser.isPresent()) {
            return ResponseEntity.ok(optionalUser.get());
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = UserRepository.save(user);
        return ResponseEntity.ok(newUser);
    }

    @DeleteMapping(value="{documentNumber}")
    public ResponseEntity<Void> deleteUser(@PathVariable("documentNumber") int documentNumber) {
        UserRepository.deleteById(documentNumber);
        return ResponseEntity.ok(null);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
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
