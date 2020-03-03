package com.codurance.bowling_kata;

public class BowlingScorer {
  public int roll(String score) {
    int sum = 0;
    char[] rolls = score.toCharArray();
    for (char roll : rolls) {
      if (roll == '1'){
        sum += 1;
      }
    }

    return sum;
  }
}
