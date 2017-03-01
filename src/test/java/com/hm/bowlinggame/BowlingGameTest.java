package com.hm.bowlinggame;

import org.junit.Test;

public class BowlingGameTest {

	@Test
	public void createGame() throws Exception {
		Game game = new Game();
	}

	@Test
	public void roll() throws Exception {
		Game game = new Game();
		game.roll(0);
	}

}
