package com.codurance.algorithm_practice.towerofhanoi;

import java.util.Arrays;
import java.util.Stack;


public class TowerOfHanoi {

  public static Stack<Integer> towerA = new Stack<>();
  public static Stack<Integer> towerB = new Stack<>();
  public static Stack<Integer> towerC = new Stack<>();
  private static int number;

  public TowerOfHanoi(Integer number) {
    this.number = number;

    for (int i = 1; i <= number; i++) {
      this.towerA.push(i);
    }
  }

  public void solve() {
    solveTower(towerA, towerC, towerB, number);
  }

  public void solveTower(Stack<Integer> start, Stack<Integer> target, Stack<Integer> auxiliary, int numberOfDisks) {
    if (numberOfDisks == 1) {
      printStacks();
      target.push(start.pop());
    } else {
      solveTower(start, auxiliary, target, numberOfDisks - 1);
      solveTower(start, target, auxiliary, 1);
      solveTower(auxiliary, target, start, numberOfDisks - 1);
    }
  }

  public void printStacks() {
    System.out.println();
    System.out.println("Tower A: " + Arrays.deepToString(towerA.toArray()));
    System.out.println("Tower B: " + Arrays.deepToString(towerB.toArray()));
    System.out.println("Tower C: " + Arrays.deepToString(towerC.toArray()));
  }
}

