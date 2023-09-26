package com.initiation;

public class Oparation {
    int square(int n) {
        return n * n;
    }

    static class Circle {
        double pi = 3.14;

        double area(int radius) {
            Oparation op = new Oparation();
            int rsq = op.square(radius);
            return pi*rsq;
        }

        private int square() {
            return (int) (pi*square());
        }

        public static void main(String[] args) {
            Circle c = new Circle();
            double result;
            result = c.area(5);
            System.out.println(result);
        }
    }
}