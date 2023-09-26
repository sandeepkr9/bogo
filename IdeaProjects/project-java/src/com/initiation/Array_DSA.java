package com.initiation;

//import java.util.Scanner;


import java.util.Arrays;

public class Array_DSA {
//    public static void main(String[] args) {
//        int []a = new int [5];
//        a[0] = 9;
//        a[2] = 27;
//        a[3] = 56;
//        a[4] = 97;
    //System.out.println(Arrays.toString(a));// printing the complete array
    //retrieving array through for loop
//        for (int i = 0; i < a.length; i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        //retrieving array through for-each loop
//        for (int i :a){
//            System.out.println(i);
//        }
    //Multi Dimensional arrays
    //2-D array
//        int arr[][] = new int[3][4];
//        arr[0][0] = 23;
//        arr[1][3] = 34;
//        arr[1][1] = 45;
//        arr[2][2] = 21;
//        arr[2][3] = 31;
//        arr[2][1] = 53;
//        arr[2][0] =32;
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
    //3-DArray
//        int a[][][] = new int[2][][];
//        a[0] = new int[2][];
//        a[0][0] = new int[3];
//        a[0][1] = new int[2];
//        a[1] = new int[2][];
//        a[0][0] = new int[2];
//        a[0][1] = new int[3];
//        System.out.println(Arrays.toString(a[0][1]));
    // Sorting
    //Bubble Sorting
    // Java program for implementation of Bubble Sort

//        void bubbleSort(int[] arr)
//        {
//            int n = arr.length;
//            for (int i = 0; i < n - 1; i++)
//                for (int j = 0; j < n - i - 1; j++)
//                    if (arr[j] > arr[j + 1]) {
//                        // swap arr[j+1] and arr[j]
//                        int temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//        }
//
//        /* Prints the array */
//        void printArray(int[] arr)
//        {
//            for (int j : arr)
//            System.out.print(j + " ");
//            System.out.println();
//        }
//
//        // Driver method to test above
//        public static void main(String[] args)
//        {
//            Array_DSA ob = new Array_DSA();
//            int[] arr = { 5, 1, 4, 2, 8 };
//            ob.bubbleSort(arr);
//            System.out.println("Sorted array");
//            ob.printArray(arr);
//        }
//    }

    //  Selection Sort
//public static void main(String[] args)
//{
//    int size, i, j, temp;
//    int[] arr = new int[50];
//    Scanner scan = new Scanner(System.in);
//
//    System.out.print("Enter Array Size : ");
//    size = scan.nextInt();
//
//    System.out.print("Enter Array Elements : ");
//    for(i=0; i<size; i++)
//    {
//        arr[i] = scan.nextInt();
//    }
//
//    System.out.print("Sorting Array using Selection Sort Technique..\n");
//    for(i=0; i<size; i++)
//    {
//        for(j=i+1; j<size; j++)
//        {
//            if(arr[i] > arr[j])
//            {
//                temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//    }
//    System.out.print("Now the Array after Sorting is :\n");
//    for(i=0; i<size; i++)
//    {
//        System.out.print(arr[i]+ "  ");
//    }
// }

// Insertion sort
//    public static void main(String[] args) {
//        int[] a={8,4,1,2,6};
//        int temp, j;
//        for (int i=1; i<a.length; i++){
//            temp=a[i];
//            j=i;
//            while(j>0 && a[j-1]>temp){
//                a[j]=a[j-1];
//                j=j-1;
//            }
//            a[j]=temp;
//        }for (int i=0; i<a.length; i++){
//            System.out.print(a[i]+" ");
//        }
//    }

    //Merge sort
//void merge(int[] a, int beg, int mid, int end)
//{
//    int i, j, k;
//    int n1 = mid - beg + 1;
//    int n2 = end - mid;
//
//    /* temporary Arrays */
//    int[] LeftArray = new int[n1];
//    int[] RightArray = new int[n2];
//
//    /* copy data to temp arrays */
//    for (i = 0; i < n1; i++)
//        LeftArray[i] = a[beg + i];
//    for (j = 0; j < n2; j++)
//        RightArray[j] = a[mid + 1 + j];
//
//    i = 0; /* initial index of first sub-array */
//    j = 0; /* initial index of second sub-array */
//    k = beg;  /* initial index of merged sub-array */
//    while (i < n1 && j < n2)
//    {
//        if(LeftArray[i] <= RightArray[j])
//        {
//            a[k] = LeftArray[i];
//            i++;
//        }
//        else
//        {
//            a[k] = RightArray[j];
//            j++;
//        }
//        k++;
//    }
//    while (i<n1)
//    {
//        a[k] = LeftArray[i];
//        i++;
//        k++;
//    }
//    while (j<n2)
//    {
//        a[k] = RightArray[j];
//        j++;
//        k++;
//    }
//}
//    void mergeSort(int[] a, int beg, int end)
//    {
//        if (beg < end)
//        {
//            int mid = (beg + end) / 2;
//            mergeSort(a, beg, mid);
//            mergeSort(a, mid + 1, end);
//            merge(a, beg, mid, end);
//        }
//    }
//    /* Function to print the array */
//    void printArray(int[] a, int n)
//    {
//        int i;
//        for (i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
//    }
//    public static void main(String[] args)
//    {
//        int[] a = { 11, 30, 24, 7, 31, 16, 39, 41 };
//        int n = a.length;
//        Array_DSA m1 = new Array_DSA();
//        System.out.println("\nBefore sorting array elements are - ");
//        m1.printArray(a, n);
//        m1.mergeSort(a, 0, n - 1);
//        System.out.println("\nAfter sorting array elements are - ");
//        m1.printArray(a, n);
//        System.out.println(" ");
//    }

    //Quick Sort
//    public static int partition(int[] a, int low,int high){
//        int pivot=a[high];
//        int i=low-1;
//        for (int j=low; j<high; j++){
//            if (a[j]<pivot){
//                i++;
//                //swap
//                int temp=a[i];
//                a[i]=a[j];
//                a[j]=temp;
//            }
//
//        }
//        i++;
//        int temp=a[i];
//        a[i]=a[high];
//        a[high]=temp;
//        return i;
//    }
//    public static void quicksort(int[] a, int low, int high) {
//       if (low<high){
//           int pi=partition(a,low,high);
//           quicksort(a,low,pi-1);
//           quicksort(a,pi+1,high);
//       }
//    }
//    public static void main(String[] args) {
//        int[] a={12,8,45,3,5,16};
//        int n=a.length;
//        quicksort(a , 0 , n-1);
//        //print
//        for (int i=0; i<n; i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//    }

    //heap sort
//static void heap(int a[], int n, int i)
//{
//    int largest = i; // Initialize largest as root
//    int left = 2 * i + 1; // left child
//    int right = 2 * i + 2; // right child
//    // If left child is larger than root
//    if (left < n && a[left] > a[largest])
//        largest = left;
//    // If right child is larger than root
//    if (right < n && a[right] > a[largest])
//        largest = right;
//    // If root is not largest
//    if (largest != i) {
//        // swap a[i] with a[largest]
//        int temp = a[i];
//        a[i] = a[largest];
//        a[largest] = temp;
//
//        heap(a, n, largest);
//    }
//}
//    /*Function to implement the heap sort*/
//    static void heapSort(int a[], int n)
//    {
//        for (int i = n / 2 - 1; i >= 0; i--)
//            heap(a, n, i);
//
//        // One by one extract an element from heap
//        for (int i = n - 1; i >= 0; i--) {
//            /* Move current root element to end*/
//            // swap a[0] with a[i]
//            int temp = a[0];
//            a[0] = a[i];
//            a[i] = temp;
//
//            heap(a, i, 0);
//        }
//    }
//    /* function to print the array elements */
//    static void printArr(int a[], int n)
//    {
//        for (int i = 0; i < n; ++i)
//            System.out.print(a[i] + " ");
//    }
//    public static void main(String args[])
//    {
//        int a[] = {45, 7, 20, 40, 25, 23, -2};
//        int n = a.length;
//        System.out.print("Before sorting array elements are ");
//        printArr(a, n);
//        heapSort(a, n);
//        System.out.print("After sorting array elements are ");
//        printArr(a, n);
//    }

    //String Sort
//    public static void main(String[] args) {
//        String str = "Sandeep";
//        char a[] = str.toCharArray();
//        //Approach1
//        char temp;
//        for (int i=0; i<a.length; i++){
//            for (int j=i+1; j<a.length; j++){
//                if (a[i]>a[j]){
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        System.out.println(new String(a));
//
//        //Approach2
//        String str2="sandeep";
//        char[] charArray=str2.toCharArray();
//        Arrays.sort(charArray);
//        System.out.println(new String(charArray));
//    }

    //String Sort
//public static void main(String[] args) {
//String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
//    int size = countries.length;
////logic for sorting
//for(int i = 0; i<size-1; i++)
//    {
//        for (int j = i+1; j<countries.length; j++)
//        {
////compares each elements of the array to all the remaining elements
//            if(countries[i].compareTo(countries[j])>0)
//            {
////swapping array elements
//                String temp = countries[i];
//                countries[i] = countries[j];
//                countries[j] = temp;
//            }
//        }
//    }
////prints the sorted array in ascending order
//System.out.println(Arrays.toString(countries));
//}
}