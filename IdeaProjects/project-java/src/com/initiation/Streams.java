package com.initiation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//class Products{
//    int id;
//
//    @Override
//    public String toString() {
//        return "Products{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", Price=" + Price +
//                '}';
//    }
//
//    String name;
//    float Price;
//    Products(int id,String name,float Price){
//        this.id=id;
//        this.name=name;
//        this.Price=Price;
//
//    }
//}
//
//public class Streams {
//    public static void main(String[] args) {
//        List<Products> li=new ArrayList<>();
//        li.add(new Products(12,"gdghnhds",6786));
//        li.add(new Products(13,"gdghdsds",6785.45f));
//        li.add(new Products(16,"gdtyrfds",6731));
//        li.add(new Products(32,"sadsds",6786.7f));
//        List<Float> price=li.stream()
//                .filter(p ->p.Price>=6786)//.forEach(System.out::println);
//                .map(p -> p.Price)
//                .collect(Collectors.toList());
//        System.out.println(price);
//    }
//}

//Stream 8 forEach() method
public class Streams {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("football");
        li.add("volleyball");
        li.add("basketball");
        li.add("cricket");
        li.add("badminton");
        System.out.println("Iterating by passing lambda expression");
        li.stream().forEachOrdered(games-> System.out.println(games));
        System.out.println("Iterating by passing method reference");
        li.stream().forEachOrdered(System.out::println);
    }
}
