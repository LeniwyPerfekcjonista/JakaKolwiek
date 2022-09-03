package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.mock;

@RequiredArgsConstructor
public class UserServiceImplTest {

    private UserRepository userRepository;

    private UserServiceImpl userService;
    @BeforeEach
    void setup () {
        userRepository = mock(UserRepository.class);
        userService = new UserServiceImpl(userRepository);
    }

    @Test
    public void createUserTest(){
        //given - deklarujemy potrzebne rzeczy
        User user = new User("Tomek", "lalka", 1L);
        //when - wywołujemy metody
        User result = userService.createUser("Tomek", "lalka");

        //then - sprawdzamy rezultat metody
        Assertions.assertEquals(user,result);
    }

}
