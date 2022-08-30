package com.example.demo.model;

import com.example.demo.functionalinterfaces.ClothingType;

import java.util.Objects;

public class Cloting {

    private String brand;
    private double price;
    private ClothingType type;

    public Cloting() {} // Czy to jest potrzebne ?


    public Cloting(String brand, double price, ClothingType type) {
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public ClothingType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cloting cloting = (Cloting) o;
        return Double.compare(cloting.price, price) == 0 && Objects.equals(brand, cloting.brand) && type == cloting.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, type);
    }

}
