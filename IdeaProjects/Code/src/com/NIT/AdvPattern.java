package com.NIT;

public class AdvPattern {
    public static void main(String[] args){
        int x = 4;
        for(int i = 0; i <= x; i++){//Butterfly pattern
            for(int j = 1; j <= i; j++){
                //upper part
                System.out.print("* ");
            }//spaces
            int sp = 2*(x-i);
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }// lower part
        for(int i = x; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                //upper part
                System.out.print("* ");
            }//spaces
            int sp = 2*(x-i);
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
       }
        /*for (int i = 1; i <= x; i++){//rhombus
            //spaces
            for (int j = 1; j <= x-i; j++) {
                System.out.print("  ");
            }//stars
        for (int j = 1; j <= 5; j++){
            System.out.print("* ");
        }
        System.out.println();
    }*/
        //NumberPyramid
        /*for(int i = 0; i <= x; i++){
            for(int j = 0; j <= x-i; j++){//spaces
                System.out.print(" ");
            }//number
            for (int j = 0; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/
        //PalandromePyramid
        /*for (int i = 0; i <= x; i++){
            for(int j = 0; j <= x-i; j++){//spaces
                System.out.print(" ");
            }
            for(int j = i; j >= 0; j--){
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        //DiamondPattern
        /*for(int i=0; i<=x; i++){//UpperPart
            for (int j=0; j<=x-i; j++ ) {//spaces
                System.out.print(" ");
            }
            for (int j=i; j>=0; j--){
                System.out.print("*");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }//LowerPart
        for(int i=x; i>=0; i--){//UpperPart
            for (int j=0; j<=x-i; j++ ) {//spaces
                System.out.print(" ");
            }
            for (int j=i; j>=0; j--){
                System.out.print("*");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
