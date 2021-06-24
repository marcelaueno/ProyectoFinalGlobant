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



    @GetMapping("/listUser")
    public List<User> listUser() {

        return userService.listUser();
    }


    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {

        return userService.createUser(user);
    }

    @RequestMapping("/getUserById/{userId}")
    public Optional<User> getUserById(@PathVariable("userId") User user) {
        return userService.getUserById(user);

    }

    @DeleteMapping("/deleteUserById/{userId}")
    public String deleteUserById(@PathVariable("userId") Long idUser) {
        return userService.deleteUserById(idUser);

    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}