package com.initiation;

import java.util.Scanner;

public class GreaterNumber2 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner s = new Scanner(System.in);
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        // using if-else if - else method
//        if(a > b && b > c){
//            System.out.println("a is greater...");
//        }else if (b > c && a < b){
//            System.out.println("b is greater...");
//        }else{
//            System.out.println("c is greater...");
//        }
        // using nested if method
        if(a > b){
            if (a > c){
                System.out.println("a is greater...");
            }else{
                System.out.println("c is greater...");
            }
        }else if (b > c){
            System.out.println("b is greater...");
        }else{
            System.out.println("c is greater...");
        }
    }
}
