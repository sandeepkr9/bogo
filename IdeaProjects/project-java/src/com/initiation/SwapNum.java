package com.initiation;

public class SwapNum {
    public static void main(String[] args) {
//        using three variables
        int a = 12, b = 34;
//        int temp;
//        System.out.println(" Numbers before swapping: "+a+ " "+b);
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("Numbers after swapping: "+a+ " "+b);
//        using two variables
//        System.out.println("Numbers before swapping: "+a+" "+b);
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("Numbers after swapping: "+a+" "+b);
//        using XOR
        System.out.println("Number before Swapping: "+a+" "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Number after swapping: "+a+" "+b);
    }
}
