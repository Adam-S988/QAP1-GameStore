package com.keyin;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Game, Integer> items = new HashMap<>();
    private GameStore store;

    public Cart (GameStore store) {
        this.store = store;
    }

    public void addGame(Game game, int quantity) {
        int storeQuantity = store.getQuantity(game);

        if (quantity > storeQuantity) {
            System.out.println("Error: Cannot add more than available stock (" + storeQuantity + ").");
            return;
        }
        items.put(game, items.getOrDefault(game, 0) + quantity);
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Game, Integer> entry : items.entrySet()) {
            total += entry.getKey().getGamePrice() * entry.getValue();
        }
        return total;
    }

    public Map<Game, Integer> getItems() {
        return items;
    }
}
