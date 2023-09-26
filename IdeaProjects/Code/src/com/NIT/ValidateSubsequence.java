package com.NIT;

public class ValidateSubsequence {
    // Function to check if an array is subarray of another array
    static boolean isSubarray(int A[], int B[], int n, int m){
        //2 pointers to traverse the array
        int i = 0, j = 0;
        // traverse both array simultaneously
        while (i < n && j < m){
            if (A[i] == B[j]){
                i++;
                j++;
                if ( j == m)
                    return true;
            }
            else {
                i = i - j + 1;
                j =0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int A[] = {5, 1, 22, 25, 6, -1, 8, 10};
        int n = A.length;
        int B[] = {1, 6, -1, 10};
        int m = B.length;
        if (isSubarray(A, B, n,m)){
            System.out.println("False");
        }else System.out.println("True");
    }
}
