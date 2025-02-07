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
            System.out.println("Error: Cannot add more than available stock (" + game.getGameQuantity() + ").");
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
        for (Game item: items) {
            System.out.println(item);
        }
    }

    public List<Game> getItems() {
        return items;
    }

    public void setItems(List<Game> items) {
        this.items = items;
    }
}
