package com.NIT;

import java.util.*;

public class NodeDepth {
    static int depth = -1;
    //Structure of treeNode
    static class Node{
        int data;
        Node left;
        Node right;
    }
    //Utility function to create a new Binary Tree Node
    static Node newNode(int item){
        Node temp = new Node();
        temp.data = item;
        temp.left = temp .right = null;
        return  temp;
    }
    //function to find depth of tree
    static int findDepth (Node root, int x){
        //Base case
        if (root == null)
            return -1;
        //initialise dist as -1
        int dist = -1;
        //check if x is current node
        if ((root.data == x)||(dist = findDepth(root.left,x))>=0||(dist = findDepth(root.right,x))>=0)
            return dist+1;
        return dist;
    }

    public static void main(String[] args) {
        Node root = newNode(5);
        root.left = newNode(10);
        root.left.left = newNode(20);
        root.left.right = newNode(25);
        root.left.right.right = newNode(45);
        root.right = newNode(15);
        root.right.left = newNode(30);
        root.right.right = newNode(35);
        int k = 25;
        System.out.println("Depth: "+findDepth(root, k));
    }
}
