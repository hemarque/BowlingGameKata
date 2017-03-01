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

	private void rollMany(int pins, int times) {
		for (int i = 0; i < times; i++) {
			game.roll(pins);
		}
	}

	@Test
	public void allZeros() throws Exception {
		rollMany(0, 20);
		assertEquals(0, game.score());
	}

	@Test
	public void allOnes() throws Exception {
		rollMany(1, 20);
		assertEquals(20, game.score());
	}

}
