package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    // Ta klasa opisuje co każda metoda z interfejsu będzie wykonywała
    @Override
    public User createUser(String name, String password, Long id) {
        return new User(name,password,id);
    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
