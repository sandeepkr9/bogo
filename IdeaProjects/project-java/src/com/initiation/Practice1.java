package com.initiation;

import java.util.Scanner;

public class Practice1 {
    //linear search
    public static void main(String[] args) {
        int[] a={1,7,4,6,5};
        int key = 6;

        if(search(a, key) == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is found at " + search(a, key));
        }
    }
    static int search(int[] arr, int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
