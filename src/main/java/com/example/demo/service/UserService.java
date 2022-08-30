package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    /* tu określamy różne metody którze każdy user powiniemn
    mieć ale nie określamy co one mają robić */
    User createUser(String name, String password,Long id);
    User getUser (Long id) ;
    User updateUser (Long id, User user);
    void deleteUser (Long id);

}
