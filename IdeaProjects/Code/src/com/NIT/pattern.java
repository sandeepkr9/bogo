package com.NIT;

public class pattern {
    public static void main(String[] args) {
        int a = 5;
        //int n = 1;
        for (int i = 1; i <= a; i++) {
            //for (int j = 0; j <= a -i; j++) {
              //  System.out.print("   ");
            //}
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

