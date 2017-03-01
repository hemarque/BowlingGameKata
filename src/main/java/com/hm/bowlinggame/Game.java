package com.hm.bowlinggame;

public class Game {
	int[] rolls = new int[21];
	int currentRoll = 0;

	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int score() {
		int score = 0;
		for (int pins : rolls)
			score += pins;
		return score;
	}

}
