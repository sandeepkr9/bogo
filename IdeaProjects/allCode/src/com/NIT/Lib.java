package com.NIT;

import java.util.Scanner;

public class Lib {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BookData bd = new BookData();
        System.out.println("Book Code:");
        bd.bCode = s.nextLine();
        System.out.println("Book Name:");
        bd.bName = s.nextLine();
        System.out.println("Book Author:");
        bd.bAuthor = s.nextLine();
        System.out.println("Book Price:");
        bd.bPrice = Float.parseFloat(s.nextLine());
        System.out.println("Quantity:");
        bd.bQty = Integer.parseInt(s.nextLine());
        bd.getBookData();
    }
}
