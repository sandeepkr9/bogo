package com.NIT;

import java.util.Scanner;

public class MainClass6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CustData cd = new CustData();
        CustAdd ca = new CustAdd();
        CustContact cc = new CustContact();
        System.out.println("Enter Customer Name:");
        cd.custName = s.nextLine();
        System.out.println("Enter Account Number:");
        cd.accNo = Long.parseLong(s.nextLine());
        System.out.println("Enter Account Type:");
        cd.accType = s.nextLine();
        System.out.println("Enter Balance:");
        cd.Balance = Float.parseFloat(s.nextLine());
        System.out.println("Enter House Number:");
        ca.hNo = s.nextLine();
        System.out.println("Enter Street Name:");
        ca.sName = s.nextLine();
        System.out.println("Enter City:");
        ca.city = s.nextLine();
        System.out.println("Enter PinCode:");
        ca.pinCode = Integer.parseInt(s.nextLine());
        System.out.println("Enter Contact Number:");
        cc.phNo = Long.parseLong(s.nextLine());
        System.out.println("Enter MailId:");
        cc.mail = s.nextLine();
        cd.getcustData();
        ca.getCustAdd();
        cc.getCustContact();
    }
}
