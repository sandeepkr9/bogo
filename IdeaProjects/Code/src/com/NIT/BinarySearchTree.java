package com.NIT;

public class BinarySearchTree {
    static int min_diff, min_diff_key;

    //binary tree node has key, pointer to left child and pointer to right child
    static class Node{
        int key;
        Node left, right;
    }
    //utility that allocate a new node with the given key and null left and right pointer
    static Node newNode(int key){
        Node n = new Node();
        n.key = key;
        n.left = n.right = null;
        return(n);
    }
    //function to find node with min absolute diff with given K min_diff = min diff and min_ diff_key = node having min absolute diff with K
    static void maxDiffUtil(Node ptr , int k){
        if (ptr == null)
            return;
        if (ptr.key == k){
            min_diff_key =k;
            return;
        }
        if (min_diff > Math.abs(ptr.key - k)){
            min_diff = Math.abs(ptr.key - k);
            min_diff_key = ptr.key;
        }
        //if K is less than ptr.key then move in left subtree else in right subtree
        if (k < ptr.key)
            maxDiffUtil(ptr.left, k);
        else
            maxDiffUtil(ptr.right, k);

    }//wrapper over maxDiffUtil()
    static int maxDiff(Node root, int k){
        //Initialize min diff
        min_diff = 1235; min_diff_key =-1;
        //finding value of min_diff_key in tree with k
        maxDiffUtil(root, k);
        return min_diff_key;
    }//run case

    public static void main(String[] args) {
        Node root = newNode(9);
        root.left = newNode(4);
        root.right = newNode(17);
        root.left.left = newNode(3);
        root.left.right = newNode(6);
        root.right.left = newNode(8);
        root.right.right = newNode(22);
        root.left.right.left = newNode(5);
        root.left.right.right = newNode(7);
        root.right.right.left = newNode(20);
        int k = 18;
        System.out.println(maxDiff(root, k));
    }
}
