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
		int currentRoll = 0;
		for (int currentFrame = 0; currentFrame < NUMBER_OF_FRAMES; currentFrame++) {
			if (isStrike(currentRoll)) {
				score += ALL_PINS + rolls[currentRoll + 1]
						+ rolls[currentRoll + 2];
				currentRoll++;
			} else if (isSpare(currentRoll)) {
				score += ALL_PINS + rolls[currentRoll + 2];
				currentRoll += 2;
			} else {
				score += rolls[currentRoll] + rolls[currentRoll + 1];
				currentRoll += 2;
			}
		}
		return score;
	}

	private boolean isStrike(int currentRoll) {
		return rolls[currentRoll] == 10;
	}

	private boolean isSpare(int currentRoll) {
		return rolls[currentRoll] + rolls[currentRoll + 1] == 10;
	}

}
