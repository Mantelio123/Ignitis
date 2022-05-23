package com.test.Ignitis.service;

import com.test.Ignitis.model.User;
import com.test.Ignitis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers()
    {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user1 -> users.add(user1));
        return users;
    }

    public void saveOrUpdate(User user)
    {
        userRepository.save(user);
    }


    public void delete(int id)
    {
        userRepository.deleteById(id);
    }
}
