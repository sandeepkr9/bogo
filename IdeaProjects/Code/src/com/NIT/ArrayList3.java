package com.NIT;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args){
        ArrayList<String> l3 = new ArrayList<>();//Creating Arraylist
        l3.add("Mango");
        l3.add("Apple");
        l3.add("Banana");
        l3.add("PineApple");
        l3.add(3,"Grapes");
        l3.remove(2);
        Collections.sort(l3);
        //Traversing list through for each loop
        for (String fruit:l3)
            System.out.println(fruit);
        System.out.println("New List...");
        ArrayList<Integer> ln = new ArrayList<>();//Creating integer list
        ln.add(12);
        ln.add(23);
        ln.add(34);
        ln.add(13);
        ln.remove(2);
        ln.add(2,90);
        Collections.sort(ln);
        for (int Number:ln)
            System.out.println(Number);
    }
}
