package com.example.demo.optional;

import com.example.demo.model.Cloting;

public class Mein {
    public static void main(String[] args) {
        Cloting cloting = new Cloting();
        Box<Cloting> box = new Box<>(cloting);
        boolean present = box.isPresent();
        System.out.println(present);
        Box<Cloting> box2 = new Box<>(null);
        boolean present2 = box2.isPresent();
        System.out.println(present2);

    }
    int a = 5;
}
