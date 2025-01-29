package com.keyin;

public class Game {
    private int gameId;
    private String gameTitle;
    private double gamePrice;

    public Game(int gameId, String gameTitle, double gamePrice) {
        this.gameId = gameId;
        this.gameTitle = gameTitle;
        this.gamePrice = gamePrice;
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

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }
}
