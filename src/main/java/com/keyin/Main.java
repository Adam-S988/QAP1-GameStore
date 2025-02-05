package com.keyin;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game tetris = new Game(1, "Tetris", 39.99);
        Game mario = new Game(2, "Super Mario", 59.99);

        GameStore store = new GameStore();
        store.addGameToStore(tetris, 2);
        store.addGameToStore(mario, 1);

        Cart cart = new Cart(store); // ✅ Create a Cart instance

        while (true) {
            System.out.println("\n1. View the Game Store");
            System.out.println("2. Add game to the Game Store");
            System.out.println("3. Add game to your cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Games in Store:");
                    for (Game game : store.browseGames()) {
                        System.out.println("Game ID: " + game.getGameId() +
                                ", Title: " + game.getGameTitle() +
                                ", Price: $" + game.getGamePrice() +
                                ", Quantity: " + store.getQuantity(game));
                    }
                }
                case 2 -> {
                    System.out.print("Enter Game title: ");
                    String gameTitle = scanner.nextLine();
                    System.out.print("Enter Game ID: ");
                    int gameId = scanner.nextInt();
                    System.out.print("Enter Game price: ");
                    double gamePrice = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    Game newGame = new Game(gameId, gameTitle, gamePrice);
                    store.addGameToStore(newGame, quantity);
                    System.out.println(gameTitle + " added to store with quantity " + quantity);
                }
                case 3 -> {
                    System.out.print("Enter game ID: ");
                    int gameId = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    Game selectedGame = store.getGameById(gameId);
                    if (selectedGame != null) {
                        cart.addGame(selectedGame, quantity);
                    } else {
                        System.out.println("Game not found in store.");
                    }
                }
                case 4 -> {
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

//        System.out.println("Games in Store:");
//        for (Game game : store.browseGames()) {
//            System.out.println("Game ID: " + game.getGameId() + ", Title: " + game.getGameTitle() + ", Quantity: " + store.getQuantity(game) + ", Price: $" + game.getGamePrice());
//        }
//
//        Cart cart = new Cart(store);
//
//        cart.addGame(tetris, 2);
//        cart.addGame(mario, 3);
//
//        System.out.println("\nGames in Cart:");
//        for (Map.Entry<Game, Integer> entry : cart.getItems().entrySet()) {
//            System.out.println(entry.getKey().getGameTitle() + ", Quantity: " + entry.getValue());
//        }
//
//        double total = cart.calculateTotal();
//        System.out.println("\nTotal Price: $" + total);
//    }
//}
