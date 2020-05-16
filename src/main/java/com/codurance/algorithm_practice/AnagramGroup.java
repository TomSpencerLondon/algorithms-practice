package com.codurance.algorithm_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class AnagramGroup {
    public static void main(String[] args) {
        AnagramGroup anagramGroup = new AnagramGroup();
        System.out.println(Arrays.deepToString(anagramGroup.group(new String[]{"yo", "act", "flop", "tac", "cat", "oy", "olfp"})));
    }

    public String[][] group(String[] input) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            List<String> anagrams = new ArrayList<>();
            anagrams.add(input[i]);

            for (int j = i + 1; j < input.length; j++) {
                if (areAnagrams(input[i], input[j])) {
                    anagrams.add(input[j]);
                    input[j] = "";
                }
            }
            result.add(anagrams);
        }

        return result.stream()
                .filter(l -> !l.contains(""))
                .sorted(Comparator.comparingInt(List::size))
                .map(l -> l.toArray(String[]::new))
                .toArray(String[][]::new);
    }

    private boolean areAnagrams(String s, String s1) {
        return sortAlphabetically(s).equals(sortAlphabetically(s1));
    }

    private String sortAlphabetically(String s) {
        char firstString[] = s.toCharArray();
        Arrays.sort(firstString);
        return new String(firstString);
    }
}
