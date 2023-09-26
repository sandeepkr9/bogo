package com.initiation;
 import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class DSA {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        /*int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum = "+sum);
        int age = sc.nextInt();
        if( age <=12){
            System.out.println("You are a Kid");
        }else if(age <=19){
            System.out.println(" You are a Teenage");
        }else if(age <=40){
            System.out.println("You are an adult");
        }else
        {
            System.out.println("You are an old man");
                }*/
    //for(int i = 0;i <= 60;i++)
        /*do {
            System.out.println("counter : "+a);
            a = a+1;
        }while(a <= 20);*/

    //String Sort
//    public static void main(String[] args) {
//        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
//        int size = countries.length;
////logic for sorting
//        for (int i = 0; i < size - 1; i++) {
//            for (int j = i + 1; j < countries.length; j++) {
////compares each elements of the array to all the remaining elements
//                if (countries[i].compareTo(countries[j]) > 0) {
////swapping array elements
//                    String temp = countries[i];
//                    countries[i] = countries[j];
//                    countries[j] = temp;
//                }
//            }
//        }
////prints the sorted array in ascending order
//        System.out.println(Arrays.toString(countries));
//    }

    //Linear Sort
//    public static void main(String[] args) {
//        int[] a={5,32,12,7,3};
//        int item=12;
//        int temp=0;
//        for (int i=0; i<a.length; i++){
//            if (a[i]==item){
//            System.out.println("item is present at "+i+"th index position");
//            temp=temp+1;
//            }
//        }if (temp==0){
//            System.out.println("item not found");
//        }
//    }

    //Binary Search
//    int binarySearch(int[] a, int r, int l, int x) {
//        if (r >= l) {
//            int mid = l + (l - r) / 2;
//            if (a[mid] == x)
//                return mid;
//            if (a[mid]>x)
//                return binarySearch(a,l,mid-1,x);
//                return binarySearch(a,mid+1,r,x);
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        DSA bs=new DSA();
//        int a[]={2,8,12,35,75};
//        int n=a.length;
//        int x=35;
//        int result=bs.binarySearch(a,0,n-1,x);
//        if (result==-1){
//            System.out.println("Element not found");
//        }else {
//            System.out.println("Element found at "+result+"th position");
//        }
//    }

    //maximum element in array
//    public static void main(String[] args) {
//        int[] a= {6,8,3,1,9};
//        int max=a[0];
//        for(int i=0;i<a.length;i++) {
//            if(max<a[i]) {
//                max=a[i];
//
//            }
//        }System.out.println("maximum element is: "+max);
//    }

    // reverse a string
//    public static void main(String[] args) {
//        String st="hello";
//        String rev="";
//        int length=st.length();
//        for (int i=length-1;i>=0;i--){
//            rev=rev+st.charAt(i);
//        }
//        System.out.print(rev);
//    }

    //palindrome no
//    public static void main(String[] args) {
//        int req=1221;
//        int temp=req;
//        int rem,rev=0;
//        while(req>0){
//            rem=req%10;
//            rev=(rev*10)+rem;
//            req=req/10;
//        }
//        if (temp==rev){
//            System.out.println("Yes! it's palindrome no");
//        }else {
//            System.out.println("No! it's not a palindrome no");
//        }
//    }

    //no of occurrence
//    public static void main(String[] args) {
//        String s="Sandeep";
//        int count=0;
//        char search='e';
//        for (int i=0; i<s.length();i++){
//            if (s.charAt(i)==search){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }

    //anagrams string
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String a=sc.next();
//        String b=sc.next();
//        char x[]=a.toCharArray();
//        char y[]=b.toCharArray();
//        Arrays.sort(x);
//        Arrays.sort(y);
//        Boolean result=Arrays.equals(x,y);
//        if (result==true){
//            System.out.print("String are anagram");
//        }else {
//            System.out.print("String are not anagram");
//        }
//    }

    //no of vowel in string
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        int no=0;
//        String vowel = sc.next();
//        for (int i = 0; i <= vowel.length(); i++) {
//            char s = vowel.charAt(i);
//            if (s == 'a' || s == 'i' || s == 'e' || s == 'o' || s == 'u') {
//                count++;
//            }else{
//                no++;
//            }
//        }
//        System.out.println(count);
//        System.out.println(no);
//        int vCount = 0, cCount = 0;
//
//        //Declare a string
//        String str = "This is a really simple sentence";
//
//        //Converting entire string to lower case to reduce the comparisons
//        str = str.toLowerCase();
//
//        for(int i = 0; i < str.length(); i++) {
//            //Checks whether a character is a vowel
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//                //Increments the vowel counter
//                vCount++;
//            }
//            //Checks whether a character is a consonant
//            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
//                //Increments the consonant counter
//                cCount++;
//            }
//        }
//        System.out.println("Number of vowels: " + vCount);
//        System.out.println("Number of consonants: " + cCount);
    //similar element in array
//    public static void main(String[] args) {
//
//        //Initialize array
//        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
//
//        System.out.println("Duplicate elements in given array: ");
//        //Searches for duplicate element
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j]) {
//                    System.out.println(arr[j]);
//                }
//            }
//        }
//    }

    //Sorting
    //bubble sorting
//    void bubbleSort(int[] arr)
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
//            DSA ob = new DSA();
//            int[] arr = { 5, 1, 4, 2, 8 };
//            ob.bubbleSort(arr);
//            System.out.println("Sorted array");
//            ob.printArray(arr);
//        }
//    }
//
//
// Insertion Sort
//    public static void main(String[] args) {
//        int[] a={1,3,8,4,9,5};
//        int temp,j;
//        for (int i=1; i<a.length; i++){
//            temp=a[i];
//            j=i;
//            while (j>0 && a[j-1]>temp){
//                a[j]=a[j-1];
//                j=j-1;
//            }
//            a[j]=temp;
//        }
//        for (int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
//    }

    //reverse arrays
//    public static void main(String[] args) {
//        int[] a={2,7,4,6,8};
//        for (int i=a.length-1;i>=0;i--){
//            System.out.print(a[i]+" ");
//        }System.out.println();
//    }

    //swapping two no without third variable
//    public static void main(String[] args) {
//        int a=23;
//        int b=55;
//        System.out.println("Before Swapping: "+a+" "+b);
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println("After Swapping: "+a+" "+b);
//    }

    //Fibonacci series using recursion
//    static int i=0, j=1, k=0;
//    static void fibonacci(int n) {
//        if (n > 0) {
//            k=i+j;
//            i=j;
//            j=k;
//        System.out.print(k+" ");
//        fibonacci(n-1);
//        }
//    }
//    public static void main(String[] args) {
//        int n=10;
//        System.out.print(i+" "+j);
//        fibonacci(n-2);
//    }

    //factorial of integer
//    void factorial(long n){
//        if (n>=1){
//            f=f*n;
//            factorial(n-1);
//        }
//    }
//    static long f=1;
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        long n=s.nextLong();
//        DSA b=new DSA();
//        b.factorial(n);
//        System.out.println(f);
//    }

    //reverse linked list
//    static Node head; // head of list
//    static class Node {
//        int data;
//        Node next;
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//    static Node reverse(Node head) {
//        if (head == null || head.next == null)
//            return head;
//        /* reverse the rest list and put the first element at the end */
//        Node rest = reverse(head.next);
//        head.next.next = head;
//        /* tricky step -- see the diagram */
//        head.next = null;
//        /* fix the head pointer */
//        return rest;
//    }
//    /* Function to print linked list */
//    static void print() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    static void push(int data) {
//        Node temp = new Node(data);
//        temp.next = head;
//        head = temp;
//    }
//    /* Driver program to test above function*/
//    public static void main(String[] args) {
//        /* Start with the empty list */
//        push(20);
//        push(4);
//        push(15);
//        push(85);
//        System.out.println("Given linked list");
//        print();
//        head = reverse(head);
//        System.out.println("Reversed linked list");
//        print();
//    }

    //Binary Search
    //a[]={l...r}
//    int binarySearch(int[] a,int l,int r,int x){
//        if (r>=l){
//            int mid=l+(r-l)/2;
//            if (a[mid]==x){
//                return mid;
//            }
//            if (a[mid]>x){
//                return binarySearch(a,l,mid-1,x);
//            }
//            return binarySearch(a,mid+1,r,x);
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        DSA ob=new DSA();
//        int[] a={1,3,5,7,9,12};
//        int n=a.length;
//        int x=8;
//        int res= ob.binarySearch(a,0,n-1,x);
//        if (res == -1) {
//            System.out.println("Element not present");
//        }else {
//            System.out.println("Element is present");
//        }
//    }

    //second largest no.
//    public static void main(String[] args) {
//        int[] a={1,3,6,5,2,9};
//        for (int i=0;i< a.length;i++){
//            for (int j=i+1;j<a.length;j++){
//                if (a[i]<a[j]) {
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//            if (i==1)
//                break;
//        }
//        //checking the sorting of array for second largest no
////        for (int i=0; i<a.length;i++){
////            System.out.print(a[i]+" ");
////        }
////        System.out.println();
//        System.out.println(a[1]);
//    }

//    remove all occurrences from given character from string
//   public static void main(String[] args) {
//       String s="sandeep";
//       System.out.println(s.replace("e",""));
//   }

    //Inheritances
//    interface Animal{
//        String color="Black";
//    }
//     static class Cat implements Animal {
//        void meow(){
//            System.out.println("Meow");
//        }
//    }
//
//    public static void main(String[] args) {
//        Cat c=new Cat();
//        System.out.println("Color of cat is "+c.color);
//        c.meow();
//    }

    //Prime no
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int temp=0;
//        for (int i=2;i<n-1;i++){
//            if (n%i==0)
//                temp=temp+1;
//        }if (temp>0){
//            System.out.println("Not a print...");
//        }else {
//            System.out.println("Number is prime...");
//        }
//    }

    //sum of all elements in array
//    public static void main(String[] args) {
//        int[] a={1,4,6,7,2,5};
//        int sum=0;
//        for (int i=0;i<a.length;i++){
//            sum=sum+a[i];
//        }
//        System.out.println("Sum of the elements of array= "+sum);
//    }

    //Overloading and overriding
    //overloading
//    public static int add(int x,int y){
//        return (x+y);
//    }
//    public static int add(int x,int y,int z){
//        return (x+y+z);
//    }
//    public static int add(float x,int y){
//        return (int) (x+y);
//    }

    //overriding
//    public static void main(String[] args) {
//        Child ob1=new Child();
//        ob1.display();
////        Parent ob2=new Parent();
////        ob2.display();
//    }
//}
//class Parent{
//    void display(){
//        System.out.println("anything");
//    }
//}
//class Child extends Parent{
//    void display(){
//        super.display();
//        System.out.println("something");
//    }
}