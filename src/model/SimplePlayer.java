package model;

import model.interfaces.DicePair;
import model.interfaces.Player;

public class SimplePlayer implements Player {
    public SimplePlayer(String s, String the_roller, int i) {
        super();
    }

    @Override
    public String getPlayerName() {
        return null;
    }

    @Override
    public void setPlayerName(String playerName) {

    }

    @Override
    public int getPoints() {
        return 0;
    }

    @Override
    public void setPoints(int points) {

    }

    @Override
    public String getPlayerId() {
        return null;
    }

    @Override
    public boolean setBet(int bet) {
        return false;
    }

    @Override
    public int getBet() {
        return 0;
    }

    @Override
    public void resetBet() {

    }

    @Override
    public DicePair getResult() {
        return null;
    }

    @Override
    public void setResult(DicePair rollResult) {

    }

    @Override
    public String toString() {
        return null;
    }
}
