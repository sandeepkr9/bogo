package com.NIT;

public class MainClass4 {
    public static void main(String[] args) {
        StudData sd = new StudData();
        StudAddress sa = new StudAddress();
        StudContact sc = new StudContact();
        sd.stuName = "Xyz";
        sd.rollNo = "19dsa1234";
        sd.branch = "ME";
        sa.hNo = "Q-12/34";
        sa.sName= "BAC road";
        sa.city = "Asdf";
        sa.pinCode = 987605;
        sc.pNo = 9876543210L;
        sc.mailId = "xsa@gmail.com";
        sd.getStudData();
        sa.getStudAddress();
        sc.getStudContact();
    }
}
