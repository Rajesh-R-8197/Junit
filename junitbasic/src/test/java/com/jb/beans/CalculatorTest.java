package com.jb.beans;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;
    int a;
    int b;
    int na;
    int nb;
    int expectedsum;
    int nexpectedsum;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
        a = 10;
        b = 20;
        na = -1;
        nb = -10;
        expectedsum = 30;
        nexpectedsum = -11;
    }

    @Test
    void testAddPositiveNumbers(){
        int actualSum = 0;
        actualSum = calculator.add(a,b);
        Assertions.assertEquals(expectedsum,actualSum);
    }

    @Test
    void testAddNegativeNumbers(){
        int nactualSum = 0;
        nactualSum = calculator.add(na,nb);
        Assertions.assertEquals(nexpectedsum,nactualSum);
    }

    @AfterEach
    void tearDown(){
        calculator = null;
        a = 0;
        b = 0;
        na = 0;
        nb = 0;
        expectedsum = 0;
        nexpectedsum = 0;
    }
}
