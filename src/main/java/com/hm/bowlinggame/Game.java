package com.hm.bowlinggame;

public class Game {
	int[] rolls = new int[21];
	int currentRoll = 0;

	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int score() {
		int score = 0;
		int currentRoll = 0;
		for (int currentFrame = 0; currentFrame < 10; currentFrame++) {
			if (isStrike(currentRoll)) {
				score += 10 + rolls[currentRoll + 1]
						+ rolls[currentRoll + 2];
				currentRoll++;
			} else if (isSpare(currentRoll)) {
				score += 10 + rolls[currentRoll + 2];
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
