package com.ebid.core;

import java.util.ArrayList;
import java.util.List;

public class Game {
	List<String> players;

	public void addPlayer(String player) {
		if (players == null) {
			players = new ArrayList<>();
		}
		players.add(player);
	}

	public List<String> getPlayers() {
		return players;
	}

}
