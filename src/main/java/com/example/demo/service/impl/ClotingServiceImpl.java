package com.example.demo.service.impl;

import com.example.demo.functionalinterfaces.ClothingType;
import com.example.demo.model.Cloting;

public class ClotingServiceImpl implements ClotingService {
    @Override
    public Cloting creativeCloting(String brand, Double price, ClothingType type) {
        return (new Cloting(brand,price,type));
    }

    @Override
    public Cloting getCloting(String brand, ClothingType type) {
        return null;
    }
}
