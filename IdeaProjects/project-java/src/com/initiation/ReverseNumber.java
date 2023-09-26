package com.initiation;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int rem, rev = 0;
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        while (i != 0){
            rem = i % 10;
            rev = rev * 10 +rem;
            i = i/10;
        }
        System.out.println(rev);
    }
}
