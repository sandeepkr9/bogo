package com.initiation;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int a;// taking input value in console by user
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if (a % 2 == 0){
            System.out.println("The given number is Even...");
        }else{
            System.out.println("The given number is Odd...");
        }
    }
}
