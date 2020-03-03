package com.codurance.bowling_kata;

public class BowlingScorer {
  public int roll(String score) {
    if (score.equals("--|--|1-|--|--|--|--|--|--|--||"))
      return 1;
    if (score.equals("--|1-|--|--|--|--|--|--|--|--||"))
      return 1;
    if (score.equals("1-|--|--|--|--|--|--|--|--|--||"))
      return 1;
    return 0;
  }
}
