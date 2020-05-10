package com.codurance.algorithm_practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeShould {

    @ParameterizedTest
    @CsvSource(value = {
            "'abccaccx'; 'ccacc'",
            "'gxyyadnhndayyin'; 'yyadnhndayy'"
    }, delimiter = ';')
    void return_begin_and_end_of_longest_palindrome(String input, String output) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        assertEquals(output, longestPalindrome.find(input));
    }
}