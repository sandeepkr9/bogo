package com.NIT;

import java.util.ArrayList;

public class ArrayList4 {
    public static void heapify(ArrayList<Integer>hT, int i){
        int size = hT.size();//find the largest among the roots
        //left child and right child
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if (l<size && hT.get(l)>hT.get(largest))
            largest = 1;
        if (r<size && hT.get(r)>hT.get(largest))
            largest = r;//swap and continue heapifying if root is not longest
        if (largest !=  i){
            int temp = hT.get(largest);
            hT.set(i,temp);
            heapify(hT,largest);
        }

    }//function to insert an element into the tree
    void insert(ArrayList<Integer>hT, int newNumber){
        int size = hT.size();
        if (size == 0){
            hT.add(newNumber);
            for (int i = size/2-1; i>= 0; i--){
                heapify(hT, i);
            }
        }
    }//function to delete an element from the tree
    void deleteNode(com.NIT.ArrayList<Integer>hT, int num){
        int size = hT.size();
        int i;
        for (i = 0; i < size; i++){
            if (num == hT.get(i))
                break;
        }
        int temp = hT.get(i);
        hT.set(i,hT.get(size-1));
        hT.set(size-1, temp);
        hT.remove(size-1);
        for (int j = size/2-1; j >= 0; j--){
            heapify(hT, j);
        }
    }//Print the tree
     public static void printArray(ArrayList<Integer> array, int size){
        for (Integer i : array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    class ArrayList4_1 {
        public void main(String[] args) {
            ArrayList<Integer> array = new ArrayList<>();
            int size = array.size();
            /*Heap h = new Heap();
            h.insert(array, 3);
            h.insert(array, 4);
            h.insert(array, 9);
            h.insert(array, 5);
            h.insert(array, 2);
            System.out.println("Max-Heap Array:");
            h.Array(array, size);
            h.deleteNode(array, 4);
            System.out.println("After deleting an element:");
            h.printArray(array, size);*/
        }
}
}