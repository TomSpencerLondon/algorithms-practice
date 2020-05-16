package com.codurance.algorithm_practice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// write a function that takes in an array of strings and groups
// anagrams together
// same = {"yo", "act", "flop", "tac", "cat", "oy", "olfp" }
// sample output = {{"yo", "oy"}, {"flop", "olfp"}, {"act", "tac", "cat" }}
//
public class AnagramGroupShould {
    @ParameterizedTest
    @MethodSource("words")
    void return_nested_grouped_anagrams_from_list_of_words_with_same_letters(String[] input, String[][] output) {
        AnagramGroup anagramGroup = new AnagramGroup();
        assertArrayEquals(output, anagramGroup.group(input));
    }

    public static Object[] words() {
        return new Object[][]{ //
                {new String[]{"yo", "act", "flop", "tac", "cat", "oy", "olfp"}, new String[][]{{"yo", "oy"}, {"flop", "olfp"}, {"act", "tac", "cat"}}}
        };
    }
}
