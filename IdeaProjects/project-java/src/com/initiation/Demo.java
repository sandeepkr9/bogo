package com.initiation;

public class Demo {
    public void show(int x){
        System.out.println("In int: "+x);
    }
    public void show(String s){
        System.out.println("In String: "+s);
    }
    public void show(byte b){
        System.out.println("In byte: "+b);
    }
}
class UseDemo{
    public static void main(String[] args) {
        byte a = 25;
        Demo obj = new Demo();
        obj.show(a);
        obj.show("Hello");
        obj.show(250);
    }
}
