package com.test.Ignitis.controller;


import com.test.Ignitis.model.User;
import com.test.Ignitis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    private List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    private int saveUser(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
       return user.getUserId();
    }

    @DeleteMapping("/book/{userid}")
    private void deleteBook(@PathVariable("userid") int userid)
    {
        userService.delete(userid);
    }
}
