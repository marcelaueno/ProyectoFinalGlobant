package com.Book.projectBook.Controller;

import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.User;
import com.Book.projectBook.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {



    @Autowired
    private UserService userService;



    @GetMapping
    public List<User> listUser() {

        return userService.listUser();
    }


    @PostMapping
    public User createUser(@RequestBody User user) {

        return userService.createUser(user);
    }

    @RequestMapping(value="{userId}")
    public Optional<User> getUserById(@PathVariable("userId") User user) {
        return userService.getUserById(user);

    }

    @DeleteMapping(value="{userId}")
    public String deleteUserById(@PathVariable("userId") Long idUser) {
        return userService.deleteUserById(idUser);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}