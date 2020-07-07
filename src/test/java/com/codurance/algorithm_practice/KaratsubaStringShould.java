package com.codurance.algorithm_practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KaratsubaStringShould {

  @Test
  void return_7_006_652_for_5_678_and_1_234_strings() {
    assertEquals(7_006_652, KaratsubaString.calculate("1234", "5678"));
  }

  @Test
  void return_2_500_for_50_and_50() {
    assertEquals(2_500, KaratsubaString.calculate("50", "50"));
  }

  @Test
  void return_1_476_from_123_and_12() {
    assertEquals(1_476, KaratsubaString.calculate("123", "12"));
  }
}
