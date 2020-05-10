package com.codurance.algorithm_practice;

public class LongestPalindrome {


    public String find(String input) {
        String longest = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String substring = input.substring(i, j + 1);
                if(substring.length() > longest.length() && isPalindrome(substring)){
                    longest = substring;
                }
            }
        }
        return longest;
    }

    private boolean isPalindrome(String input){
        char[] inputArray = input.toCharArray();
        int n = inputArray.length;
        char[] reversedInputArray = new char[n];
        int j = inputArray.length;


        for (int i = 0; i < n; i++) {
            reversedInputArray[j - 1] = inputArray[i];
            j--;
        }

        String inputString = new String(inputArray);
        String reversedString = new String(reversedInputArray);

        if(inputString.equals(reversedString)){
            return true;
        }

        return false;
    }
}
