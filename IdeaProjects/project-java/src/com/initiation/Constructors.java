package com.initiation;

public class Constructors {
    public static void main(String[] args) {
        MyEmployee sande=new MyEmployee();
        //sande.setName("Sandeep");
        System.out.println(sande.getId());
        System.out.println(sande.getName());
    }
}
class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
    public MyEmployee(){
        name="sjhj";
        id=567;
    }
}