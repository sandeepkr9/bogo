package com.NIT;

import java.util.Scanner;

public class MainClass5 {
            public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the name=");
            String name =s.nextLine();
            System.out.println("Enter the PhoneNo=");
            long phoneNo=Long.parseLong(s.nextLine());
            System.out.println("Enter the MailId=");
            String mailId=s.nextLine();
            System.out.println("Name="+name);
            System.out.println("PhoneNo="+phoneNo);
            System.out.println("MailId="+mailId);
        }
}
