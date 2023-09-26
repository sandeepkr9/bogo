package com.NIT;

public class ArrayList<I extends Number> extends java.util.ArrayList<Integer> {
    public static void main(String[] args){
        // ArrayList in single set(basic syntax)
        java.util.ArrayList<String> list = new java.util.ArrayList<>();// a/c to java 16 version
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("PineApple");
        System.out.println(list);
    }
}
