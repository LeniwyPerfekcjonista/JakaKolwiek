package com.example.demo.serviceEnum.impl;

import com.example.demo.functionalinterfaces.ClothingType;
import com.example.demo.model.Cloting;
import com.example.demo.service.impl.ClotingServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class EnumServiceImplTest {
//    private ClotingServiceImpl clotingService = new ClotingServiceImpl();

    @Test
    public void creativeClotingTest (){

        //given - deklarujemy potrzebne rzeczy czyli dane wejścioowe
        Cloting cloting = new Cloting("Nicke",8.5, ClothingType.PANTS);
        //when - wywołujemy metody
        Cloting result = new ClotingServiceImpl().creativeCloting("Nicke",8.5, ClothingType.PANTS);

        //then - sprawdzamy rezultat metody
        Assertions.assertEquals(cloting,result);

    }
}
