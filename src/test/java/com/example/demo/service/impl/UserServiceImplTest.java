package com.example.demo.service.impl;

import com.example.demo.model.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest {

    private UserServiceImpl userService = new UserServiceImpl();

    @Test
    public void createUserTest(){
        //given - deklarujemy potrzebne rzeczy
        User user = new User("Tomek", "lalka", 1L);
        //when - wywołujemy metody
        User result = userService.createUser("Tomek", "lalka", 1L);

        //then - sprawdzamy rezultat metody
        Assertions.assertEquals(user,result);
    }

}
