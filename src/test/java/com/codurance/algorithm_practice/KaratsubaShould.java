package com.codurance.algorithm_practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KaratsubaShould {

  @Test
  void return_7_006_652_for_5_678_and_1_234() {
    assertEquals(7_006_652, Karatsuba.calculate(1234, 5678));
  }
}
