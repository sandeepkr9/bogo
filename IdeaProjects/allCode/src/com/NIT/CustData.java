package com.NIT;

public class CustData {
    String custName, accType;
    long accNo;
    float Balance;
    void getcustData(){
        System.out.println("=====Customer Data=====");
        System.out.println("Enter Account Number:"+accNo);
        System.out.println("Enter Customer Name:"+custName);
        System.out.println("Enter Account Type:"+accType);
        System.out.println("Enter Balance:"+Balance);
    }
}
