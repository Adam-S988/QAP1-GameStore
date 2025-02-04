package com.keyin;

public class GameStore {
    private Game game;
    private int quantity;

    public GameStore (Game game, int quantity) {
        this.game = game;
        this.quantity = quantity;
    }

    public Game getGame() {
        return game;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
