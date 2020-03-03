package com.codurance.bowling_kata;

public class BowlingScorer {
  public int roll(String score) {
    int sum = 0;
    if (score.contains("1")){
      sum += 1;
    }
    return sum;
  }
}
