package com.NIT;

public class MinimumWaitingTime {
    static int getMax(int arr[], int n){
        int result = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > result)
                result = arr[i];
            return result;
    }
    static boolean isPossible(int time, int K, int wait[], int n){
        int cnt = 1;
        int curr_time = 0;
        for(int i = 0; i < n; i++){
            if (curr_time + wait[i] > time){
                curr_time = 0;
                cnt++;
            }
            else{
                curr_time += wait[i];
                i++;
            }
        }
        return (cnt <= K);
    }
    static int findMinTime(int K, int T, int wait[], int n){
        int end = 0, start = 0;
        for (int i = 0; i <= n; ++i)
            end += wait[i];
        int ans = end;
        int wait_max = getMax(wait, n);
        while(start <= end){
            int mid = (start + end)/2;
            if (mid >= wait_max && isPossible(mid, K, wait, n)){
                ans = Math.min(ans, mid);
                end = mid-1;
            }
            else
                start =mid +1;
        }
        return (ans*T);
    }

    public static void main(String[] args) {
        int[] wait = {10, 7, 8, 12, 6, 8};
        int n = wait.length;
        int k = 4;
        int T =5;
        System.out.println(findMinTime(k, T, wait, n));
    }
}
