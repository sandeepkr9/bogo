package com.initiation;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = n;
        int len = 0;
        while(t != 0){
            len = len + 1;
            t = t / 10;
        }
        int a = n; int rem; int arm = 0;
        while (a != 0){
            rem = a%10;
            int mul = 1;
            for (int i = 1;i <= len;i++){
                mul = mul * rem;
            }
            arm = arm + mul;
            a = a/10;
        }
        if (arm == n){
            System.out.println(n+" is armstrong number");
        }
        else {
            System.out.println(n+" is not a armstrong number");
        }
    }
}
