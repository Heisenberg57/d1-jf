package com.suyog.practise;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }


    void sound(){
        System.out.println("Dog Barks");
    }

    void printName(){
        System.out.println(name);
    }
}
