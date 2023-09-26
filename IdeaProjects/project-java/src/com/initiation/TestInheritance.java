package com.initiation;

class Animal{
    void eat(){
        System.out.println("Eating");
    }
    static class Dog extends Animal{
        void bark(){
            System.out.println("Barking");
        }
    }
}
public class TestInheritance {
    public static void main(String[] args) {
        Animal.Dog d = new Animal.Dog();
        d.bark();
        d.eat();
    }
}
