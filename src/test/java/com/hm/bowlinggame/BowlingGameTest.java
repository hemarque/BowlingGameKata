package com.hm.bowlinggame;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
	Game game = null;

	@Before
	public void setup() {
		game = new Game();
	}

	@Test
	public void roll() throws Exception {
		game.roll(0);
	}

	@Test
	public void allZeros() throws Exception {
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(0, game.score());
	}

	@Test
	public void allOnes() throws Exception {
		for (int i = 0; i < 20; i++) {
			game.roll(1);
		}
		assertEquals(20, game.score());
	}

}
