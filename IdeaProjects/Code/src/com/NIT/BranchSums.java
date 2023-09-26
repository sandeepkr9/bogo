package com.NIT;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    public static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;
        BinaryTree(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    private static void branchSums(BinaryTree root, List<Integer> res, int sum){
        if (root == null)
            return;
        if (root.left == null && root.right ==null){
            res.add(sum + root.value);
            return;
        }
        branchSums(root.left, res, sum+ root.value);
        branchSums(root.right, res, sum+ root.value);
    }
    public static List<Integer> branchSums(BinaryTree root){
        if (root == null)
            return new ArrayList<Integer>();
        List<Integer> res = new ArrayList<>();
        branchSums(root,res,0);
        return res;
    }
}
