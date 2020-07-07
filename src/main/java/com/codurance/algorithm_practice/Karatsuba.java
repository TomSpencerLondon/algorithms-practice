package com.codurance.algorithm_practice;

import static java.lang.Math.*;

public class Karatsuba {

  public static int calculate(int input1, int input2) {
    if((length(input1) == 1) && (length(input2) == 1)){
      return input1 * input2;
    }else {
      int l = length(input1);
      int[] xArray = split(input1);
      int x1 = xArray[0];
      int x2 = xArray[1];
      int[] yArray = split(input2);
      int y1 = yArray[0];
      int y2 = yArray[1];
      int mult1 = calculate(x1, y1);
      int mult2 = calculate(x2, y2);
      int mult3 = calculate(x1 + x2, y1 + y2) - mult1 - mult2;

      return (int) ((mult1 * pow(10, l)) + ((mult3) * pow(10, l/2)) + mult2);
    }
  }

  private static int[] split(int num) {
    int l = length(num);
    int half_two = (int) (num % pow(10, l/2));
    int half_one = (int) ((num - half_two)/ pow(10, l/2));
    return new int[]{half_one, half_two};
  }


  private static int length(int num) {
    int counter = 0;
    if(num == 0){
      return 1;
    }

    while(num >= 1){
      num = num / 10;
      counter += 1;
    }

    return counter;
  }
}
