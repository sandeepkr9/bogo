package com.NIT;

import java.util.Scanner;

public class MainClass1_1 {
    static class Product{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ProdDetails pd = new ProdDetails();
            System.out.println("ProdCode = ");
            pd.pCode = s.nextLine();
            System.out.println("ProdName = ");
            pd.pName =s.nextLine();
            System.out.println("ProdPrice = ");
            pd.pPrice = Double.parseDouble(s.nextLine());
            System.out.println("ProdQty = ");
            pd.pQty = Integer.parseInt(s.nextLine());
            pd.getProdDetails();
    }
    }
}
