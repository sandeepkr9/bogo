package com.initiation;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n-1; i++){
            if (n%i==0)
            temp = temp+1;
        }if (temp>0){
            System.out.println("Not a Prime No: ");
        }else{
            System.out.println("No is Prime: ");
        }
    }
}
