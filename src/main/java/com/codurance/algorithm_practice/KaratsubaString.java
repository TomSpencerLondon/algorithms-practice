package com.codurance.algorithm_practice;

import static java.lang.Math.pow;

public class KaratsubaString {
  public static int calculate(String input1, String input2){
    if(input1.length() == 1 && input2.length() == 1){
      return Integer.parseInt(input1) * Integer.parseInt(input2);
    }

    if(input1.length() < input2.length()){
      input1 = "0".repeat(input2.length() - input1.length()) + input1;
    }else if(input2.length() < input1.length()){
      input2 = "0".repeat(input1.length() - input2.length()) + input2;
    }


    int split = input1.length() / 2;
    if(input1.length() % 2 != 0){
      split += 1;
    }

    String a = input1.substring(0, split);
    String b = input1.substring(split);
    String c = input2.substring(0, split);
    String d = input2.substring(split);
    System.out.println("this is split: " + split);
    System.out.println("The number: " + input1 + " is split in these numbers: " + a + " " + b);
    int mult1 = calculate(a, c);
    int mult2 = calculate(b, d);
    int mult3 = calculate(Integer.toString(Integer.parseInt(a) + Integer.parseInt(b)),
        Integer.toString(Integer.parseInt(c) + Integer.parseInt(d))) - mult1  - mult2;

    return (int) ((int) (pow(10, makeEven(input1.length())) * mult1) + (pow(10, correctSplit(split, input1)) * mult3 + mult2));
  }

  private static int correctSplit(int split, String input1) {
    if(input1.length() % 2 == 0){
      return split;
    }else {
      return split - 1;
    }
  }

  private static int makeEven(int num){
    if(num % 2 == 0){
      return num;
    }else {
      return num - 1;
    }
  }
}
