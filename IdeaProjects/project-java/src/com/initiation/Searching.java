package com.initiation;

public class Searching<index> {
    public static int LinearSearch(int arr[], int elementToSearch){
        for (int index = 0; index < arr.length; index++){
            if(arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }
    //testing with simple array
    int index = LinearSearch(new int[]{89, 57, 91, 47, 97, 95, 3, 27, 22, 67, 99}, 67);
        //print (67,index);
        //simple method to print result
            public void main(int elementToSearch, int index){
                Searching sc = new Searching();
                if (index == -1){
                    System.out.println(elementToSearch+"not found");
                }else{
                    System.out.println(elementToSearch+"found at index: "+index);
                }
            }
    }

