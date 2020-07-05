package com.codurance.algorithm_practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KaratsubaShould {

  @Test
  void return_7_006_652_for_5_678_and_1_234() {
    assertEquals(7_006_652, Karatsuba.calculate(1234, 5678));
  }

  @Test
  void return_2_500_for_50_and_50() {
    assertEquals(2_500, Karatsuba.calculate(50, 50));
  }
}
