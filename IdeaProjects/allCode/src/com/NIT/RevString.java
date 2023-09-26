package com.NIT;

import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st=s.nextLine();
        int len=st.length();
        System.out.println("String "+st);
        System.out.println("Length "+len);
        System.out.println("====String====");
        for (int i=len-1;i>=0;i--){
            System.out.print(st.charAt(i));
        }
    }
}
