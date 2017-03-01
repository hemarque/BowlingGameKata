package com.hm.bowlinggame;

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

}
