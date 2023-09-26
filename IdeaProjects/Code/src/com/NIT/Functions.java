package com.NIT;

import java.util.Scanner;

public class Functions {
    /*public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Product of 2 numbers ="+calculateProduct(a,b));
    }*/
    public static int calculateFactorial(int x){
        int n = 1;
        for(int i = x; i >= 10; i++){
            n = n * i;
        }
        System.out.println(n);
        return x;
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        calculateFactorial(x);
    }
}
