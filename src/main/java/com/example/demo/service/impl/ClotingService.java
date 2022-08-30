package com.example.demo.service.impl;

import com.example.demo.functionalinterfaces.ClothingType;
import com.example.demo.model.Cloting;

public interface ClotingService {

    Cloting creativeCloting (String brand, Double price, ClothingType type);
    Cloting getCloting (String brand, ClothingType type);

}
