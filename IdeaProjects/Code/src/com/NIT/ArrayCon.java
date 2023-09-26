package com.NIT;

import java.lang.*;
import java.util.Arrays;
import java.util.Collections;

public class ArrayCon {
    public static void main(String[] args){
        int[][] n = new int[5][2];
        n[0][1] = 98;
        n[1][0] = 12;
        n[2][1] = 32;
        n[3][0] = 43;
        n[4][1] = 76;
        System.out.println("Print Array:");
        for(int i = 0; i < n.length; i++){
            System.out.print(Arrays.toString(n[i]) +" ");
        }
    }
}
