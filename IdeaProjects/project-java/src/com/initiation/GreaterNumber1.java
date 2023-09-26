package com.initiation;

import java.util.Scanner;

public class GreaterNumber1 { // comparison between two numbers
    public static void main(String[] args) {
        float a, b;
        Scanner s = new Scanner(System.in);
        a = s.nextFloat();
        b = s.nextFloat();
        if(a > b){
            System.out.println("a is greater...");
        }else{
            System.out.println("b is greater...");
        }
    }
}
