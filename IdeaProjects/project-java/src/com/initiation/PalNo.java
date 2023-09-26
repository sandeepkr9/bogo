package com.initiation;

import java.util.Scanner;

public class PalNo {
    public static void main(String[] args) {
        int eno;
        System.out.println("enter the number:");
        Scanner s = new Scanner(System.in);
        eno = s.nextInt();
        int temp = eno;
        int rem , rev = 0;
        while(eno > 0)
        {
            rem = eno % 10;
            rev = (rev * 10) + rem;
            eno = eno / 10;
        }
        if(temp==rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
