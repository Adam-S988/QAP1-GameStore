package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class GameStore {
    private List<Game> inventory = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();

    public void addGameToStore(Game game, int quantity) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getGameId() == game.getGameId()) {
                quantities.set(i, quantities.get(i) + quantity);
                return;
            }
        }
        inventory.add(game);
        quantities.add(quantity);
    }

    public List<Game> browseGames() {
        return inventory;
    }

    public int getQuantity(Game game) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getGameId() == game.getGameId()) {
                return quantities.get(i);
            }
        }
        return 0;
    }
}
