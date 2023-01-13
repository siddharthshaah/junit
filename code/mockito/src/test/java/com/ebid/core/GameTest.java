package com.ebid.core;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GameTest {
	@Mock
	Game game;

	@Test
	void testAddPlayer() {
		doNothing().when(game).addPlayer("p1");
		doNothing().when(game).addPlayer("p2");

		game.addPlayer("p1");
		game.addPlayer("p2");

		verify(game, atLeast(2)).addPlayer(anyString());
	}
}
