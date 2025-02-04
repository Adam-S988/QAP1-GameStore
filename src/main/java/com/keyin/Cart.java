package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<GameStore> items = new ArrayList<>();

    public void addGame(Game game, int quantity) {
        for (GameStore item : items) {
            if (item.getGame().getGameId() == game.getGameId()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new GameStore(game, quantity));
    }

    public double calculateTotal() {
        double total = 0;
        for (GameStore item : items) {
            total += item.getGame().getGamePrice() * item.getQuantity();
        }
        return total;
    }

    public void clearCart() {
        items.clear();
    }

    public List<GameStore> getItems() {
        return items;
    }
}
