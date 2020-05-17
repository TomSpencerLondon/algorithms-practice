package com.codurance.algorithm_practice;

public class Fibonacci {
    public int findNth(int input) {
        if(input <= 2){
            return input - 1;
        }

        return findNth(input - 1) + findNth(input - 2);
    }
}
