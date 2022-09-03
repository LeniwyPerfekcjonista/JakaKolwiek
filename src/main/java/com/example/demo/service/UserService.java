package com.example.demo.service;

import com.example.demo.model.User;

import java.util.Optional;

public interface UserService {

    User createUser(String name, String password);
    Optional<User> getUser (Long id) ;
    User updateUser (Long id, User user);
    void deleteUser (Long id);

}
