package com.codurance.algorithm_practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortShould {

    SelectionSort selectionSort;

    @BeforeEach
    void setUp() {
        selectionSort = new SelectionSort();
    }

    @ParameterizedTest
    @MethodSource("numbers")
    void sorts_the_array(int[] input, int[] output) {
        assertArrayEquals(output, selectionSort.sort(input));
    }

    public static Object[] numbers() {
        return new Object[][] { //
                { new int[]{}, new int[]{}},
                { new int[]{3, 2, 1}, new int[]{1, 2, 3} },
                { new int[]{4, 3, 2, 1}, new int[]{1, 2, 3, 4}},
                {new int[]{-70, 300, 10, 20, -10, -50, 400}, new int[]{-70, -50, -10, 10, 20, 300, 400}}
        };
    }
}
