package com.linkedin.javacodechallenges;

import java.util.Scanner;

/**
 * User starts with 10 points
 * User can take a chance to double their points
 * If user takes the changes, randomness decides if they receive double or loses all
 */

public class DoubleOrNothing {

  int playerScore = 10;

  boolean finished = false;

  double rollDie() {
    return Math.floor((Math.random() * (20 - 1)) + 1);
  }

  public void playGame() {
    System.out.printf("You now have %d points.\n", this.playerScore);
    Scanner scanner = new Scanner(System.in);
    while (!finished) {

      System.out.println("Double or nothing (y/n)?");

      String answer = scanner.next();

      if (answer.equalsIgnoreCase("y")) {
        double roll = this.rollDie();

        if (roll > 10) {
          playerScore *= 2;
          System.out.printf("Congrats! You now have %d points.\n", this.playerScore);
        } else {
          finished = true;
          System.out.println("Oh no! You lost everything!");
        }

      } else if (answer.equalsIgnoreCase("n")){
        finished = true;
        System.out.printf("You win %d points!\n", this.playerScore);
      } else {
        System.out.printf("Hm... I don't know what you mean by \"%s\"\n", answer);
      }
    }
  }
}