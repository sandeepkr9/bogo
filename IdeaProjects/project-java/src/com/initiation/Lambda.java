package com.initiation;

// lambda expression

//interface Drawable{
//    public abstract void draw();
//}
//
//public class Lambda {
//    public static void main(String[] args) {
//        int width=10;
//        Drawable d2=()->{
//            System.out.println("drawing "+width);
//        };
//        d2.draw();
//    }
//}

// lambda using multi parameter

import javax.sound.midi.Soundbank;

interface Drawable{
    public abstract int draw(int a,int b);
}

public class Lambda {
    public static void main(String[] args) {
        Drawable d2=(a,b)->{
            return a+b;
        };
        d2.draw(10,20);
        System.out.println(d2);
    }
}