package com.NIT;

public class BookData {
    String bCode, bName, bAuthor;
    int bQty;
    float bPrice;
    void getBookData(){
        System.out.println("=====BookData=====");
        System.out.println("BCode : "+bCode);
        System.out.println("BName : "+bName);
        System.out.println("BAuthor : "+bAuthor);
        System.out.println("BQty : "+bQty);
        System.out.println("BPrice : "+bPrice);
    }
}
