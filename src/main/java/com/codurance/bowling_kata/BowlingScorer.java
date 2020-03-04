package com.codurance.bowling_kata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BowlingScorer {

  public int roll(String score) {
    int sum = 0;
    score = score.replaceAll("-", "0");
    List<Character> rolls = new ArrayList<>();
    for (char s : score.toCharArray()) {
      rolls.add(s);
    }
    rolls = rolls.stream()
                 .filter(c -> c != '|')
                 .collect(Collectors.toList());

    for (char roll : rolls) {
      if (Character.isDigit(roll)){
        sum += Character.getNumericValue(roll);
      }
    }

    return sum;
  }
}
