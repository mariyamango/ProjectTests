package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println(sumOfTwo(1,2));
//        System.out.println(sumOfTwo(2,3));
//        System.out.println(checkNumberForEven(3));
//        System.out.println(checkNumberForEven(2));
//        System.out.println(stringToUpperCase("hello"));
//        System.out.println(isPositive(6));

    }

    // task 1
    public static int sumOfTwo (int num1, int num2) {
        return num1 + num2;
    }

    // task 2
    public static boolean checkNumberForEven(int num) {
        return num % 2 == 0;
    }

    // task 3
    public static int productOfTwoInt (int num1, int num2) {
        return num1 * num2;
    }

    // task 4
    public static String stringToUpperCase(String word) {
        return word.toUpperCase();
    }

    // task 5
    public static boolean isPositive (int num){
        return num > 0;
    }
}