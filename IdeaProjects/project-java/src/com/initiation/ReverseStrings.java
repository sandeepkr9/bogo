package com.initiation;


public class ReverseStrings {
    public static void main(String[] args) {
        String str = "sandeep";
        int len = str.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--){
            rev= rev+str.charAt(i);
        }
        System.out.println("reverse of "+str+" is "+rev);
    }
}
