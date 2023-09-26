package com.NIT;

import java.util.Arrays;

public class NonConstructibleChange {
    int findSmallest(int arr[],int n){
        int res = 1;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++){
            if (arr[i] > res){
                return res;
            }else res += arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        NonConstructibleChange ncc = new NonConstructibleChange();
        int arr1[] = {1, 3, 4, 5};
        int n1 = arr1.length;
        System.out.println(ncc.findSmallest(arr1,n1));
        int arr2[] = {1, 2, 6, 10, 11, 15};
        int n2 = arr2.length;
        System.out.println(ncc.findSmallest(arr2,n2));
        int arr3[] = {1, 1, 1, 1};
        int n3 = arr3.length;
        System.out.println(ncc.findSmallest(arr3,n3));
        int arr4[] = {1, 1, 3, 4};
        int n4 = arr4.length;
        System.out.println(ncc.findSmallest(arr4, n4));
    }
}