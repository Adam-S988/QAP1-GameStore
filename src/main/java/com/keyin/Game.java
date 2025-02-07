package com.keyin;

public class Game {
    private int gameId;
    private String gameTitle;
    private double gamePrice;
    private int gameQuantity;

    public Game(int gameId, String gameTitle, double gamePrice, int gameQuantity) {
        this.gameId = gameId;
        this.gameTitle = gameTitle;
        this.gamePrice = gamePrice;
        this.gameQuantity = gameQuantity;
    }

    public int getGameId() {
        return gameId;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public int getGameQuantity() {
        return gameQuantity;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", gameTitle='" + gameTitle + '\'' +
                ", gamePrice=" + gamePrice +
                ", gameQuantity=" + gameQuantity +
                '}';
    }
}
