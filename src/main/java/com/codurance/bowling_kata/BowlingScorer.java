package com.codurance.bowling_kata;

public class BowlingScorer {
  public int roll(String score) {
    int sum = 0;
    char[] rolls = score.toCharArray();
    for (char roll : rolls) {
      if (Character.isDigit(roll)){
        sum += Character.getNumericValue(roll);
      }
//      if (roll == '3') {
//        sum += 3;
//      }
//      if (roll == '2') {
//        sum += 2;
//      }
//      if (roll == '1'){
//        sum += 1;
//      }
    }

    return sum;
  }
}
