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

  @Test
  public void return_two_from_two_ones() {
    BowlingScorer bowlingScorer = new BowlingScorer();
    String score = "--|--|1-|1-|--|--|--|--|--|--||";
    int roll = bowlingScorer.roll(score);
    Assert.assertEquals(2, roll);
  }

  @Test
  public void return_two_from_two() {
    BowlingScorer bowlingScorer = new BowlingScorer();
    String score = "--|--|2-|--|--|--|--|--|--|--||";
    int roll = bowlingScorer.roll(score);
    Assert.assertEquals(2, roll);
  }

  @Test
  public void return_three_from_three() {
    BowlingScorer bowlingScorer = new BowlingScorer();
    String score = "--|--|3-|--|--|--|--|--|--|--||";
    int roll = bowlingScorer.roll(score);
    Assert.assertEquals(3, roll);
  }

  @Test
  public void scores_game_of_ones() {
    BowlingScorer bowlingScorer = new BowlingScorer();
    String score = "11|11|11|11|11|11|11|11|11|11||";
    int roll = bowlingScorer.roll(score);
    Assert.assertEquals(20, roll);
  }

  @Test
  public void scores_spare_followed_by_three() {
    BowlingScorer bowlingScorer = new BowlingScorer();
    String score = "55|3-|--|--|--|--|--|--|--|--||";
    int roll = bowlingScorer.roll(score);
    Assert.assertEquals(16, roll);
  }
}
