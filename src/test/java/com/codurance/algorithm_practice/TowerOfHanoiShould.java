package com.codurance.algorithm_practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Stack;
import org.junit.jupiter.api.Test;

public class TowerOfHanoiShould {

  @Test
  void move_from_first_tower_to_last() {
    TowerOfHanoi towerOfHanoi = new TowerOfHanoi(3);
    towerOfHanoi.solve();

    assertEquals(Arrays.toString(new int[]{1, 2, 3}), Arrays.toString(towerOfHanoi.towerC.toArray()));
  }
}
