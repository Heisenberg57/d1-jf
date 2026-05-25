package com.suyog.practise;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    void sound(){
        System.out.println("Cat Meows");
    }

    void printName(){
        System.out.println(name);
    }
}
