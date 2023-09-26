package com.NIT;

public class MainClass3 {
    public static void main(String[] args){
        BookData bd = new BookData();
        bd.bCode = "A1234";
        bd.bName = "Text_Book";
        bd.bAuthor = "Xyz";
        bd.bPrice = 857.97F;
        bd.bQty = 345;
        bd.getBookData();
    }
}
