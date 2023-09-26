package com.NIT;

public class CheckPinNo {
    boolean k = false;
    boolean varify (int pinNo){
        switch (pinNo){
            case 1111: k = true;
                break;
            case 2222: k = true;
            break;
            case 3333: k = true;
            break;
        }
        return k;
    }
}
