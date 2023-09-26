package com.initiation;

public class pattern1 {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        */
        int n = 4;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        * * * *
//        * * *
//        * *
//        *
//        for (int i = n; i >= 1;i--){
//            for (int j = 1; j <= i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
        /*
                *
              * *
            * * *
          * * * *
        */
//        for (int i = 1; i <= n; i++){
//            for (int j = n-1; j >= i;j--){
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        * * * *
//          * * *
//            * *
//              *
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i-1;j++){
//                System.out.print("  ");
//            }
//            for (int j = n; j >= i; j--){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        * * * *
//        * * * *
//        * * * *
//        * * * *
//        for (int i = 1;i<= n; i++){
//            for (int j = 1; j <= n; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        * * * *
//        *     *
//        *     *
//        * * * *
//        int m = 4;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= m; j++){
//                if (i == 1 || j == 1 || i == n || j == m){
//                    System.out.print(" *");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        *
//        * *
//        * * *
//        * * * *
//        * * *
//        * *
//        *
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for (int i = n; i >=1;i--){
//            for (int j = 1; j < i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//              *
//            * *
//          * * *
//        * * * *
//          * * *
//            * *
//              *
//        for (int i = 1; i <= n; i++){
//            for (int j = n - 1; j >= i; j--){
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i;j++){
//                System.out.print("  ");
//            }
//            for (int j = n-1; j >= i; j--){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//              *
//            * * *
//          * * * * *
//        * * * * * * *
//        for (int i = 1; i <= n; i++){
//            for (int j = n-i; j >= 1; j--){
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++){
//                System.out.print(" *");
//            }
//            for (int j = 2; j <= i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//       }
//        * * * * * * *
//          * * * * *
//            * * *
//              *
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print("  ");
//            }
//            for (int j = n+2; j >= (i*2); j--){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        *
//         *
//          *
//           *
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(" ");
//                if (i == j){
//                    System.out.println("*");
//                }
//            }
//
//        }
//             *
//            *
//           *
//          *
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }
//        *   *
//         * *
//          *
//         * *
//        *   *
        //for upper half
//        for (int i = n; i >= 1; i--){
//            for (int j = i; j <= n; j++){
//                System.out.print(" ");//Print spaces
//            }
//            for (int j = 1; j <= (2*i-1); j++){
//                if (j == 1 || j == (2*i-1))//Printing star
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//        // for lower half
//        for (int i = 2; i <= n; i++){
//            for (int j = i; j <= n; j++){
//                System.out.print(" ");//print spaces
//            }
//            for (int j = 1; j <= (2*i-1); j++){
//                if (j == 1 || j == (2*i-1))//print star
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
        // different method
//        for (int i = 0; i <= n; i++){
//            for (int j = 0; j <= n; j++){
//                if (i == j || i+j == n){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        *     *
//         *   *
//          * *
//           *
//        for (int i = n; i >= 1; i--){
//            for (int j = i; j <= n; j++){
//                System.out.print(" ");//Print spaces
//            }
//            for (int j = 1; j <= (2*i-1); j++){
//                if (j == 1 || j == (2*i-1))//Printing star
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//            *
//          *   *
//         *     *
//        *       *
//        for (int i = 1; i <= n; i++){
//            for (int j = i; j <= n; j++){
//                System.out.print(" ");//print spaces
//            }
//            for (int j = 1; j <= (2*i-1); j++){
//                if (j == 1 || j == (2*i-1))//print star
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//        1
//        12
//        123
//        1234
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(+j);
//            }
//            System.out.println();
//        }
//        1
//        22
//        333
//        4444
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(+i);
//            }
//            System.out.println();
//        }
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        int a = 0;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                a = a + 1;
//                System.out.print(a+" ");
//            }
//            System.out.println();
//        }
//        1
//        21
//        321
//        4321
//        for (int i = 1; i <= n; i++){
//            for (int j = i; j >= 1; j--){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        1
//        121
//        12321
//        1234321
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            for (int j = i-1; j >= 1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
