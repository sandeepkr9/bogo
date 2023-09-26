package com.NIT;

import java.util.Scanner;

public class MainClass6_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Amount:");
        int amt = Integer.parseInt(s.nextLine());
        if(amt > 0 && amt % 100 == 0){
            if (amt <= 2000){
                System.out.println("Amount Withdrawal = "+amt);
                System.out.println("Balance Amount = "+(2000-amt));
                System.out.println("Transaction Completed");
            }
            else{
                System.out.println("Invalid Amount");
            }
        }
    }
}
