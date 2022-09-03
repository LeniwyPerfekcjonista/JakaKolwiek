package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

private final UserRepository userRepository;

    @Override
    public User createUser(String name, String password) {
        User user = new User(name, password);
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUser(Long id) {

        return userRepository.findById(id);
    }

    @Override
    @Transactional
    public User updateUser(Long id, User user) {
        Optional<User> userDb = userRepository.findById(id);
        if (userDb.isPresent()){
            User updatedUser = userDb.get();
            updatedUser.setPassword(user.getPassword());
            updatedUser.setName(user.getName());
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }
}
