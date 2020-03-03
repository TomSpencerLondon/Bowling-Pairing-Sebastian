package com.codurance.bowling_kata;

import org.junit.Assert;
import org.junit.Test;

public class BowlingScorerShould {
  @Test
  public void return_zero_from_zero() {
    BowlingScorer bowlingScorer = new BowlingScorer();
    String score = "-";
    int roll = bowlingScorer.roll(score);
    Assert.assertEquals(0, roll);

  }
}
