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
}