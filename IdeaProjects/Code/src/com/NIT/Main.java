package com.NIT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MainSubClass msc = new MainSubClass();
        System.out.println("Enter the variables:");
        msc.a = Integer.parseInt(s.nextLine());
        msc.b = Integer.parseInt(s.nextLine());
       // msc.x = Integer.parseInt(s.nextLine());
        //msc.y= Integer.parseInt(s.nextLine());
        //msc.p = Integer.parseInt(s.nextLine());
        //msc.q = Integer.parseInt(s.nextLine());
        msc.Calculate();
        /* int a = 10, b = 33, x = 45, y = 67, p = 23, q = 41;
        int c = (a*b)/(x-y)*(p*q);
        //int z = x + y*(a/b);
        /*System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
        System.out.println("Value of c = "+c);
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
        System.out.println("Value of x = "+x);
        System.out.println("Value of y = "+y);
        System.out.println("Value of p = "+p);
        System.out.println("Value of q = "+q);
        System.out.println("Value of c = "+c);*/
    }
}
