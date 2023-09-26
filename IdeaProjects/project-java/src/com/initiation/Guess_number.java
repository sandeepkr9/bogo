package com.initiation;

import java.util.Random;
import java.util.Scanner;

public class Guess_number {
    //Rock Paper Scissor
//    public static void main(String[] args) {
//        //user Input
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter 0 for Rock\n1 for Paper\n2 for scissor");
//        int userInput=s.nextInt();
//        //computer input
//        Random ran=new Random();
//        int comInput=ran.nextInt();
//        //result decision
//        if (userInput == comInput) {
//            System.out.println("Draw");
//        }else if (userInput==1 && comInput==0||userInput==0&&comInput==2||userInput==2&&comInput==1){
//            System.out.println("You Won");
//        }else {
//            System.out.println("Computer Won");
//        }
//    }

    //Guessing number
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        random ran=new random();
        ran.userInput();
        while (ran.r!= ran.input){
            if (ran.r< ran.input){
                System.out.println("It's too large! Give smaller number");
            }else{
                System.out.println("It's too small! Give larger number");
            }
            System.out.println("Try Again!");
            ran.setGuess();
            ran.userInput();
        }
        ran.check();
        System.out.println("The number was "+ran.getGuess());
    }
}
class random{
    int r,input,guess=0;
    Scanner s=new Scanner(System.in);
    random(){
        Random ran=new Random();
        r=ran.nextInt(10);
        System.out.println("Guess any number between 0-10: ");
    }
    public void userInput(){
        input=s.nextInt();
    }

    public void setGuess() {
        guess++;
    }

    public int getGuess() {
        return guess;
    }
    public void check(){
        if (input==r){
            System.out.println("You are correct");
        }
    }
}