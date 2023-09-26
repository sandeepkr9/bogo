package com.NIT;

import java.util.Scanner;

public class MainClass4_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudData sd = new StudData();
        StudAddress sa = new StudAddress();
        StudContact sc = new StudContact();
        System.out.println("StudName:");
        sd.stuName = s.nextLine();
        System.out.println("StudRoll:");
        sd.rollNo = s.nextLine();
        System.out.println("StudBranch:");
        sd.branch = s.nextLine();
        System.out.println("StudHNo:");
        sa.hNo = s.nextLine();
        System.out.println("StudSName:");
        sa.sName = s.nextLine();
        System.out.println("StudCity:");
        sa.city = s.nextLine();
        System.out.println("PinCode:");
        sa.pinCode = Integer.parseInt(s.nextLine());
        System.out.println("StudPhNo:");
        sc.pNo = Long.parseLong(s.nextLine());
        System.out.println("StudMail:");
        sc.mailId = s.nextLine();
        sd.getStudData();
        sa.getStudAddress();
        sc.getStudContact();
    }
}
