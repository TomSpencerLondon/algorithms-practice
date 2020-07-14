package com.codurance.algorithm_practice.mergesort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class MergeSortShould {
    @Test
    void sort_an_unsorted_array() {
      MergeSort mergeSort = new MergeSort();
      int[] result = mergeSort.sort(new int[]{5, 4, 3, 2, 7, 1, 2});
      assertEquals(Arrays.toString(new int[]{1, 2, 2, 3, 4, 5, 7}), Arrays.toString(result));
    }
}
