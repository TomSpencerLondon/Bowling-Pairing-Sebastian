package com.codurance.bowling_kata;

import org.junit.Assert;
import org.junit.Test;

public class BowlingScorerShould {
  @Test
  public void return_zero_from_zero() {
    BowlingScorer bowlingScorer = new BowlingScorer();
    String score = "--|--|--|--|--|--|--|--|--|--||";
    int roll = bowlingScorer.roll(score);
    Assert.assertEquals(0, roll);
  }

  @Test
  public void return_one_from_one() {
    BowlingScorer bowlingScorer = new BowlingScorer();
    String score = "1-|--|--|--|--|--|--|--|--|--||";
    int roll = bowlingScorer.roll(score);
    Assert.assertEquals(1, roll);
  }

  @Test
  public void return_one_from_one_in_the_second_frame() {
    BowlingScorer bowlingScorer = new BowlingScorer();
    String score = "--|1-|--|--|--|--|--|--|--|--||";
    int roll = bowlingScorer.roll(score);
    Assert.assertEquals(1, roll);
  }

  @Test
  public void return_one_from_one_in_the_third_frame() {
    BowlingScorer bowlingScorer = new BowlingScorer();
    String score = "--|--|1-|--|--|--|--|--|--|--||";
    int roll = bowlingScorer.roll(score);
    Assert.assertEquals(1, roll);
  }
}
