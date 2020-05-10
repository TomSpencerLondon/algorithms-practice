package com.codurance.algorithm_practice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeShould {
    @ParameterizedTest
    @CsvSource({
            "abba, true",
            "kayak, true",
            "level, true",
            "antidisestablishmentarianism, false"
    })
    void return_true_or_false_for_palindrome_check(String input, boolean output) {
        Palindrome palindrome = new Palindrome();
        assertEquals(output, palindrome.check(input));
    }
}
