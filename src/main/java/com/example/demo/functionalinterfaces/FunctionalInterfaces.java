package com.example.demo.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        Integer[] tab = {5,6,9,3,28,65,11,87,4};
        // function<T,R>, consumer<T>, supplier<T>, predicate
        List<String> collect = Arrays.stream(tab)
                .map(integer -> integer.toString()).collect(Collectors.toList());
        Arrays.stream(tab)
                .filter(number ->  number%2==0).map(number -> number*5).filter(number -> number>100)
                .forEach(System.out::println);
        if (Arrays.stream(tab)
                .anyMatch(number -> number%2==0)){
        }
//        GenericTypes<Integer> integerGenericTypes = new GenericTypes<>();
//        System.out.println(integerGenericTypes.calculate(5));
//        GenericTypes<Double> doubleGenericTypes = new GenericTypes<>();
//        System.out.println(doubleGenericTypes.calculate(5.0));
//        GenericTypes<String> stringGenericTypes = new GenericTypes<>();
//        System.out.println(stringGenericTypes.calculate("Ikakabana"));




    }

}
