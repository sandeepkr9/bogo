import java.util.*;

public class DArray1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = s.nextInt();
        int a[] = new int[size];//Array Creation
        System.out.println("Enter " + size + " Element");
        for (int p = 0; p < size; p++) {
            a[p] = s.nextInt();
        }
        System.out.println("=====Display from Array=====");
        for (int i = 0; i <= size-1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n=====Display Array in Reverse======\n");
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.print(a[j] + " ");
        }
    }
}



