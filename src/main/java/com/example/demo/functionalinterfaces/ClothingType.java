package com.example.demo.functionalinterfaces;

public enum ClothingType {
    SHIRT("Elegancki","Black"),PANTS("Casual","Black"),SHOES("Sport","Black");
    final String styl;
    final String color;

    ClothingType(String styl, String color) {
        this.styl = styl;
        this.color = color;
    }
    public static void printAllTypes (){
        System.out.println(SHIRT.styl);
    }
}
