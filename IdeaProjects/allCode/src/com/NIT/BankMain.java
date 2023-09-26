package com.NIT;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        xyz:
        while(true) {
            System.out.println("Enter the pinNo:");
            int pinNo = Integer.parseInt(s.nextLine());
            CheckPinNo cpn = new CheckPinNo();
            boolean k = cpn.varify(pinNo);
            if (k) {
                System.out.println("====Choice====");
                System.out.println("1. WithDraw\n2. Deposit");
                System.out.println("Enter the Choice:");
                int choice = Integer.parseInt(s.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter the Amt:");
                        int a1 = Integer.parseInt(s.nextLine());
                        if (a1 > 0 && a1 % 100 == 0) {
                            if (a1 <= 2000) {
                                WithDraw wd = new WithDraw();
                                wd.wDraw(a1);
                            } else
                                System.out.println("Insufficient Fund");
                        } else if (k) {
                            System.out.println("Invalid Amount");
                        }
                        break xyz;
                    case 2:
                        System.out.println("Enter the Amount:");
                        int a2 = Integer.parseInt(s.nextLine());
                        if (a2 > 0 && a2 % 100 == 0) {
                            Deposit dp = new Deposit();
                            dp.deposit(a2);
                        } else
                            System.out.println("Invalid Amount");
                        break xyz;
                    default:
                        System.out.println("Invalid Choice");
            break xyz;
                }
            }
            else{
                System.out.println("Invalid Pin");
                count++;
            }
            if (count == 3){
                System.out.println("Account Temporarily Blocked");
                break xyz;
            }
        }
    }
}
