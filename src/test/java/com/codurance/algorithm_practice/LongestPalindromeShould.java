package com.codurance.algorithm_practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeShould {

    @ParameterizedTest
    @CsvSource(value = {
            "'abccaccx'; 3;8",
    }, delimiter = ';')
    void return_begin_and_end_of_longest_palindrome(String input, int start, int end) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        longestPalindrome.findRange(input);
        assertEquals(start, longestPalindrome.start);
        assertEquals(end, longestPalindrome.end);
    }
}