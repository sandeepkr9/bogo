package com.initiation;

import java.util.Scanner;

public class Factorial {
    static int fact = 1;
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        Factorial ob = new Factorial();
        ob.calcFact(a);
        System.out.println("Factorial of "+a+" is: "+fact);
//        using loop method
//        for (int i = a; i >= 1; i--){
//            fact = fact *i;
//        } System.out.println("The factorial of "+a+" is: "+fact);
    }
    // using recursion method
    void calcFact(int a)
    {
        if (a >= 1){
            fact = fact * a;
            calcFact(a-1);
        }
    }
}
