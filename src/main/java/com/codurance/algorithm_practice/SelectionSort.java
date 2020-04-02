package com.codurance.algorithm_practice;

public class SelectionSort {
    public int[] sort(int[] array) {
        if (array.length == 0){
            return new int[]{};
        }
        int currentIndx = 0;
        while(currentIndx < array.length - 1){
            int smallestIndx = currentIndx;
            for(int i = currentIndx + 1; i < array.length; i++){
                if (array[smallestIndx] > array[i]){
                    smallestIndx = i;
                }
            }
            int tmp = array[currentIndx];
            array[currentIndx] = array[smallestIndx];
            array[smallestIndx] = tmp;
            currentIndx++;
        }

        return array;
    }
}
