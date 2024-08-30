package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println(sumOfTwo(1,2));
//        System.out.println(sumOfTwo(2,3));
        System.out.println(checkNumberForEven(3));
        System.out.println(checkNumberForEven(2));
    }

    // task 1
    public static int sumOfTwo (int num1, int num2) {
        return num1 + num2;
    }

    // task 2
    public static boolean checkNumberForEven(int num) {
        return num % 2 == 0;
    }
}