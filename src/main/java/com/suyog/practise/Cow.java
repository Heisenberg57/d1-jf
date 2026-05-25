package com.suyog.practise;

public class Cow extends Animal{

    public Cow(String name){
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Cow Moos");
    }
}
