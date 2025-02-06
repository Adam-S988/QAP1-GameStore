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

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public int getGameQuantity() {
        return gameQuantity;
    }

    public void setGameQuantity(int gameQuantity) {
        this.gameQuantity = gameQuantity;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
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
