package com.initiation;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // declaration
//        int arr[];
//        arr = new int[]{10, 20, 30};//creation
        // initialization
       // int[] arr = {10,20,30};
        // declaration and creation
        int[] arr = new int[]{20,50,40};
        System.out.println(Arrays.toString(arr));//retrieving the arr
        System.out.println(arr.length);//size of the arr
        System.out.println(arr[2]);//specific data
    }
}
