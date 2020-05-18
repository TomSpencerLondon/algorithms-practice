package com.codurance.algorithm_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class Permutations {
    public static void main(String[] args){
        int[] input = new int[]{1, 2, 3};
        Permutations permutations = new Permutations();
        System.out.print(Arrays.deepToString(permutations.find(input)));
    }


    public int[][] find(int[] input) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(asList(1, 2, 3));
        result.add(asList(2, 3, 1));


        return result.stream()
                .map(list -> list.stream().mapToInt(i -> i).toArray())
                .toArray(int[][]::new);
    }
}
