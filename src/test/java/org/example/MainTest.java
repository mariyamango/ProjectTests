package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sumOfTwo_expect5summing2and3() {
        //Given
        int expect = 5;
        int num1 = 2;
        int num2 = 3;
        //When
        int actual = Main.sumOfTwo(num1, num2);
        //Then
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void checkNumberForEven_expectTrueFor2() {
        //Given
        int num = 2;
        //When
        boolean actual = Main.checkNumberForEven(num);
        //Then
        Assertions.assertTrue(actual);
    }

    @Test
    void productOfTwoInt_expect20of4and5(){
        //Given
        int expect = 20;
        //When
        int actual = Main.productOfTwoInt(4,5);
        //Then
        Assertions.assertEquals(expect, actual);
    }
}