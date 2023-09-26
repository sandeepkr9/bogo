package com.initiation;

public class Test {
    public static void main (String[] args){
     // variables
     // primitive data type
     byte b = 16;
     int i =2167;
     long l= 73228347562L;
     float f= 18.5f;
     char ch ='@';
     boolean bull = false;
        System.out.println("Print the value of byte="+b);
        System.out.println("Print the value of int="+i);
        System.out.println("Print the value of long="+l);
        System.out.println("Print the value of float="+f);
        System.out.println("Print the value of char="+ch);
        System.out.println("Print the value of boolean="+bull);

        //non-primitive data types
        //length
        String name = "start";
        System.out.println(name.length());

        //new oparator
        String operation = new String("start");
        String operation0 = new String("stop");
        System.out.println(operation);
        System.out.println(operation0);

        //Strings
        //Concatenate
        String function = new String(operation+" or "+operation0);
        System.out.println(function);

        //String
        // charAt
        String s="enter";
        System.out.println(s.charAt(3));
        //length
        System.out.println(s.length());
        //replace
        String s1=s.replace('e','i');
        System.out.println(s1);
        //substring
        
    }


}
