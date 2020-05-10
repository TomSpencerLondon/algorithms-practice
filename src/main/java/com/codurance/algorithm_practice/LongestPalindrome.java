package com.codurance.algorithm_practice;

public class LongestPalindrome {


    public String find(String input) {
        int[] currentLongest = {0, 1};

        for (int i = 1; i < input.length(); i++) {
            int[] odd = getLongestPalindromeFrom(input, i - 1, i + 1);
            int[] even = getLongestPalindromeFrom(input, i - 1, i);
            int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
            currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
        }
        return input.substring(currentLongest[0], currentLongest[1]);
    }

    private int[] getLongestPalindromeFrom(String input, int leftIndex, int rightIndex){
        while(leftIndex >= 0 && rightIndex < input.length()){
            if(input.charAt(leftIndex) != input.charAt(rightIndex)){
                break;
            }
            leftIndex--;
            rightIndex++;
        }
        return new int[]{ leftIndex + 1, rightIndex};
    }
}
