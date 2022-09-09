package com.example.demo.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Box<T> {
    List<T> list = new ArrayList<>();

    public Box(T object) {

        list.add(object);
    }

    public boolean isEmpty() {
        T condition = this.list.get(0);
        if (condition == null) {
            return true;
        }
        return false;
    }

    public T orElse(Supplier<T> supplier){
        if (isPresent()) {
            return this.list.get(0);
        }
        supplier.get();
    }

    public boolean isPresent() {
        T condition = this.list.get(0);
        if (condition == null) {
            return false;
        }
        return true;
    }
}
