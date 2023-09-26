package com.initiation;

import java.util.ArrayList;

public class comm {
    public static void main(String[] args) {
        //Problem 1: circle and cylinder
//        circle c=new circle(12);
//        System.out.println("area of circle "+c.area());
//        cylinder2 cy=new cylinder2(12,10);
//        System.out.println("volume of cylinder "+cy.volume());

        //Problem 2: rectangle and cuboid
//        rectangle rect=new rectangle(8,5);
//        System.out.println("area of rectangle: "+rect.area());
//        cuboid cu=new cuboid(7,4,9);
//        System.out.println("volume of cuboid: "+cu.volume());

        //abstract class
//        AvonCycle cycle=new AvonCycle();
//        System.out.println(cycle.applyBrake(2));
//        cycle.blowHorn();
//        cycle.start();

    }
}

//problem 1
//class circle{
//    public int radius;
// parameterized constructor
//    public circle(int r) {
//        this.radius=r;
//    }
// return type constructor
//    public double area(){
//        return Math.PI*this.radius*this.radius;
//    }
//}
// inherited class
//class cylinder2 extends circle{
//    public int height;
// parameterized constructor
//    cylinder2(int r, int h){
//        super(r);
//        this.height=h;
//    }
// return type constructor
//    public double volume() {
//        return super.area()*this.height;
//    }
//}

//problem 2
//class rectangle{
//    public int length;
//    public int breadth;
//    //parameterised constructor
//    rectangle(int l, int b){
//        this.length=l;
//        this.breadth=b;
//    }
//    //return type constructor
//    public double area(){
//        return this.length*this.breadth;
//    }
//}
////cuboid class
//class cuboid extends rectangle{
//    public int height;
//    cuboid(int l, int b, int h){
//        super(l,b);
//        this.height=h;
//    }
//    public double volume(){
//        return super.area()*this.height;
//    }
//}

//abstract classes
//interface bicycle{
//    int a=21;
//    int applyBrake(int decrement);
//    void accelerate(int increment);
//}
//interface hornBlow{
//    void blowHorn();
//    void start();
//}
//class AvonCycle implements bicycle,hornBlow{
//    public void blowHorn() {
//        System.out.println("Blow Horn");
//    }
//
//    public int applyBrake(int decrement) {
//        System.out.println("Applying Brake");
//        return decrement;
//    }
//
//    public void accelerate(int increment) {
//        System.out.println("Accelerate");
//    }
//    public void start() {
//        System.out.println("Key Start");
//    }
//}


//