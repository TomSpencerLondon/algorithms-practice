package com.codurance.algorithm_practice;

public class Palindrome {
    public boolean check(String input) {
        char[] inputArray = input.toCharArray();
        int n = inputArray.length;
        char[] reversed = new char[n];
        int j = inputArray.length;

        for (int i = 0; i < n; i++) {
            reversed[j - 1] = inputArray[i];
            j--;
        }

        String inputString = new String(inputArray);
        String reversedString = new String(reversed);

        if(inputString.equals(reversedString)){
            return true;
        }

        return false;
    }
}
