package com.codurance.algorithm_practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

// write a function that takes an
// integer n and returns the nth Fibonacci number
// sample input n = 2 output = 1
// n = 6 output = 5
// 5 / 0, 1, 1, 2, 3, 5
public class FibonacciShould {
    @ParameterizedTest
    @CsvSource({
            "2, 1",
            "6, 5",
            "7, 8",
            "8, 13"
    })
    void find_the_nth_fibonacci(int input, int output) {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(output, fibonacci.findNth(input));
    }
}
