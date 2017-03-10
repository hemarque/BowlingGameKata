package com.hm.bowlinggame;

public class Game {
	final int MAX_POSSIBLE_ROLLS = 21;
	final int ALL_PINS = 10;
	final int NUMBER_OF_FRAMES = 10;
	int[] rolls = new int[MAX_POSSIBLE_ROLLS];
	int currentRoll = 0;

	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int score() {
		int score = 0;
		int roll = 0;
		for (int currentFrame = 0; currentFrame < NUMBER_OF_FRAMES; currentFrame++) {
			if (isStrike(roll)) {
				score += ALL_PINS + nextFirstRoll(roll)
						+ nextSecondRoll(roll);
				roll++;
			} else if (isSpare(roll)) {
				score += ALL_PINS + nextSecondRoll(roll);
				roll += 2;
			} else {
				score += currentRoll(roll) + nextFirstRoll(roll);
				roll += 2;
			}
		}
		return score;
	}

	private boolean isStrike(int roll) {
		return currentRoll(roll) == ALL_PINS;
	}

	private boolean isSpare(int roll) {
		return currentRoll(roll) + nextFirstRoll(roll) == ALL_PINS;
	}

	private int currentRoll(int roll) {
		return rolls[roll];
	}

	private int nextSecondRoll(int roll) {
		return rolls[roll + 2];
	}

	private int nextFirstRoll(int roll) {
		return rolls[roll + 1];
	}
}
