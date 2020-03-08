package model;

import model.interfaces.DicePair;
import model.interfaces.Player;

public class SimplePlayer implements Player {
    private String playerId;
    private String playerName;
    private int points;
    private int bet;
    private DicePair rollResult;

    public SimplePlayer(String playerId, String playerName, int initialPoints) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.points = initialPoints;
        this.bet = 0;
        this.rollResult = null;

    }

    @Override
    public String getPlayerName() {
        return this.playerName;
    }

    @Override
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String getPlayerId() {
        return this.playerId;
    }

    @Override
    public boolean setBet(int bet) {
        if (bet > 0 && (this.points - bet) >= 0) {
            this.bet = bet;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getBet() {
        return this.bet;
    }

    @Override
    public void resetBet() {
        this.bet = 0;
    }

    @Override
    public DicePair getResult() {
        return this.rollResult;
    }

    @Override
    public void setResult(DicePair rollResult) {
        this.rollResult = rollResult;
    }

    @Override
    public String toString() {
        return String.format("Player: id=%d, name=%s, bet=%d, points=%d, RESULT .. Dice 1: %s, Dice 2: %s .. Total: %d",
                this.playerId, this.playerName, this.points, this.rollResult.getDie1().toString(), this.rollResult.getDie2().toString(), this.rollResult.getDie1().getNumber() + this.rollResult.getDie2().getNumber());
    }
}
