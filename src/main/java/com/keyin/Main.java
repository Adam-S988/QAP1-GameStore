package com.keyin;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Game tetris = new Game(1, "Tetris", 39.99);
        Game mario = new Game(2, "Super Mario", 59.99);

        GameStore store = new GameStore();
        store.addGameToStore(tetris, 2);
        store.addGameToStore(mario, 1);

        System.out.println("Games in Store:");
        for (Game game : store.browseGames()) {
            System.out.println("Game ID: " + game.getGameId() + ", Title: " + game.getGameTitle() + ", Price: $" + game.getGamePrice());
        }

        Cart cart = new Cart(store);

        cart.addGame(tetris, 2);
        cart.addGame(mario, 3);

        System.out.println("\nGames in Cart:");
        for (Map.Entry<Game, Integer> entry : cart.getItems().entrySet()) {
            System.out.println(entry.getKey().getGameTitle() + ", Quantity: " + entry.getValue());
        }

        double total = cart.calculateTotal();
        System.out.println("\nTotal Price: $" + total);
    }
}
