package com.example.demo.controler;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    public User postUser(@RequestParam String name,@RequestParam String password){
        return userService.createUser(name,password);
    }
    /*
    Utwórz metode get / update/ delete
    Utwórz analogicznie serwis i kontroler dla klasy Clouting

     Metoda w kontrolerze zwraca zawsze to samo co w serwisie
     Adnotacje których urzywamy w metodach
     get - getmaping
     update - postmaping - @reqestbody User
     delete - deletMaping -
     Long id -oznaczamy adnotacją @PathVariable

     Pobrać baze danych pod postgresql - 14.5 (najnowsza) i pgadmin4
     */




}
