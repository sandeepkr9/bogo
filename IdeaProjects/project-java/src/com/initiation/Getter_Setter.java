package com.initiation;

public class Getter_Setter {
//    public static void main(String[] args) {
//        MyEmployee sandy=new MyEmployee();
//        sandy.setName("Sandeep");
//        System.out.println(sandy.getName());
//        sandy.setId(2456);
//        System.out.println(sandy.getId());
//    }
//}
//class MyEmployee{
//    private int id;
//    private String name;
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name=n;
//    }
//
//    public int getId() {
//        return id;
//    }
//    public void setId(int i){
//        id=i;
//    }

    public static void main(String[] args) {

        //Problem 1
//        cylinder cd=new cylinder();
//        cd.setRadius(12);
//        cd.setHeight(7);
//        System.out.println(cd.getRadius());
//        System.out.println(cd.getHeight());

        //Problem 2
        cylinder cd=new cylinder();
        cd.setRadius(12);
        cd.setHeight(7);
        System.out.println(cd.getRadius());
        System.out.println(cd.getHeight());
        System.out.println(cd.CSA());
        System.out.println(cd.TSA());
        System.out.println(cd.volume());

    }
}

class cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = h;
    }
    public double CSA(){
        return 2*3.14*radius*height;
    }
    public double TSA(){
        return 2*3.14*radius*height+2*3.14*radius;
    }
    public double volume(){
        return 2*3.14*radius*radius*height;
    }
}