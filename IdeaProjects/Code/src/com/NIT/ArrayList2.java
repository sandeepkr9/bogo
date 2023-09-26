package com.NIT;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args){
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Mango");
        l2.add("Apple");
        l2.add("Banana");
        l2.add("PineApple");
        //traversing the list through Iterator
        Iterator itr = l2.iterator();//getting the Iterator
        while (itr.hasNext()){//check If Iterator have element
            System.out.println(itr.next());//Printing the element and move to next
        }
    }
}
