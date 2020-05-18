package com.codurance.algorithm_practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1, 2, 3

// 1, 3, 2
// 2, 1, 3
// 2, 3, 1
// 3, 1, 2
// 3, 2, 1

public class PermutationsShould {
    @ParameterizedTest
    @MethodSource("numbers")
    void return_all_permutations_for_int_array(int[] input, int[] output) {
        Permutations permutations = new Permutations();

        assertEquals(output, permutations.find(input));

    }

    public static Object[] numbers() {
        return new Object[][]{ //
                {new int[]{1, 2, 3}, new int[][]{{1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}}}
        };
    }
}
