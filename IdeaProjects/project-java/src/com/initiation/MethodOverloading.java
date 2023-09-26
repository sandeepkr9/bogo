package com.initiation;

import java.util.Scanner;

public class MethodOverloading {
    public static int sum(int x, int y){
        return (x+y);
    }
    public static int sum(int x, int y, int z){
        return(x + y + z);
    }
    public static double sum(double x, double y){
        return (x +y);
    }
}

