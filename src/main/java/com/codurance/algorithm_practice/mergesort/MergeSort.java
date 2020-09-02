package com.codurance.algorithm_practice.mergesort;

import java.util.Arrays;

public class MergeSort {
  public int[] sort(int[] array){
    if(array.length == 1) {
      return array;
    }else {
      int middle = (int) Math.ceil(((float) array.length)/ 2);
      int[] leftArray = sort(Arrays.copyOfRange(array, 0, middle));
      int[] rightArray = sort(Arrays.copyOfRange(array, middle, array.length));
      return merge(leftArray, rightArray);
    }
  }

  public static int[] merge(int[] leftArray, int[] rightArray){
    int i = 0;
    int j = 0;
    int k = 0;

    int[] mergedArray = new int[leftArray.length + rightArray.length];
    while(i < leftArray.length && j < rightArray.length){
      if(leftArray[i] <= rightArray[j]){
        mergedArray[k] = leftArray[i];
        i++;
        k++;
      }else {
        mergedArray[k] = rightArray[j];
        j++;
        k++;
      }
    }

    while(i < leftArray.length){
      mergedArray[k] = leftArray[i];
      i++;
      k++;
    }
    while(j < rightArray.length){
      mergedArray[k] = rightArray[j];
      j++;
      k++;
    }

    return mergedArray;
  }
}
