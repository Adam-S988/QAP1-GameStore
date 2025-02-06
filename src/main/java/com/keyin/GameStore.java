package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class GameStore {
    private List<Game> inventory = new ArrayList<>();

    public void addGameToStore(Game game) {
        inventory.add(game);
    }

    public Game getGameById(int gameId) {
        for (Game game : inventory) {
            if (game.getGameId() == gameId) {
                return game;
            }
        }
        return null;
    }

    public List<Game> browseGames() {
        return inventory;
    }
}
