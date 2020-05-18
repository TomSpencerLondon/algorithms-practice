package com.codurance.algorithm_practice;

import java.util.*;

import static java.util.Arrays.asList;

public class AnagramGroup {
    public static void main(String[] args) {
        AnagramGroup anagramGroup = new AnagramGroup();
        System.out.println(Arrays.deepToString(anagramGroup.group(new String[]{"yo", "act", "flop", "tac", "cat", "oy", "olfp"})));
    }

    public String[][] group(String[] input) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<String> sorted = new ArrayList<>();
        for (String word : input) {
            sorted.add(sortAlphabetically(word));
        }

        for (String word : sorted) {
            if (anagramMap.containsKey(word)){
                anagramMap.get(word).add(input[sorted.indexOf(word)]);
            }else{
                anagramMap.put(word, new ArrayList<>(Arrays.asList(input[sorted.indexOf(word)])));
            }
        }

        for(String key : anagramMap.keySet()){
            result.add(anagramMap.get(key));
        }

        return result.stream()
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
