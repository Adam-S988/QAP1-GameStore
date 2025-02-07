package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Game> items = new ArrayList<>();
    private GameStore store;

    public Cart (GameStore store) {
        this.store = store;
    }

    public void addGame(Game game, int quantity) throws Exception {
        if (quantity > game.getGameQuantity()) {
            throw new Exception("Cannot add more than available stock.");
        }
        for (int i = 1; i <= quantity; i++) {
            items.add(game);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Game item: items) {
            total += item.getGamePrice();
        }
        return total;
    }

    public void printGamesInCart() {

        List<Game> countedGames = new ArrayList<>();

        for (Game item : items) {
            int count = 0;

            for (Game newItem : items) {
                if (newItem.getGameTitle().equals(item.getGameTitle())) {
                    count++;
                }
            }

            if (!countedGames.contains(item)) {
                System.out.println("Game: " + item.getGameTitle() + ", Quantity: " + count);
                countedGames.add(item);
            }
        }
    }

}
