package model;

import model.interfaces.DicePair;
import model.interfaces.GameEngine;
import model.interfaces.Player;
import view.interfaces.GameEngineCallback;

import java.util.Collection;
import java.util.HashMap;

public class GameEngineImpl implements GameEngine {
    //TODO: Check if this is allowed
    private HashMap<String, Player> listOfPlayers;
    private GameEngineCallback gameEngineCallback;

    public GameEngineImpl() {
        this.listOfPlayers = new HashMap<String, Player>();
    }

    @Override
    public void rollPlayer(Player player, int initialDelay1, int finalDelay1, int delayIncrement1, int initialDelay2, int finalDelay2, int delayIncrement2) {

    }

    @Override
    public void rollHouse(int initialDelay1, int finalDelay1, int delayIncrement1, int initialDelay2, int finalDelay2, int delayIncrement2) {

    }

    @Override
    public void applyWinLoss(Player player, DicePair houseResult) {
        //TODO: Does this reset other things like player bet
        if (houseResult.getTotal() > player.getResult().getTotal()) {
            //House wins
            player.setPoints(player.getPoints() - player.getBet());
        } else if (houseResult.getTotal() < player.getResult().getTotal()) {
            //Player wins
            player.setPoints(player.getPoints() + player.getBet());
        } else {
            //Draw
            //TODO: Do anything?e
        }
    }

    @Override
    public void addPlayer(Player player) {
        this.listOfPlayers.put(player.getPlayerId(), player);
    }

    @Override
    public Player getPlayer(String id) {
        return this.listOfPlayers.get(id);
    }

    @Override
    public boolean removePlayer(Player player) {
        if (this.listOfPlayers.containsValue(player)) {
            this.listOfPlayers.remove(player);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean placeBet(Player player, int bet) {
        return player.setBet(bet);
    }

    @Override
    public void addGameEngineCallback(GameEngineCallback gameEngineCallback) {
        this.gameEngineCallback = gameEngineCallback;
    }

    @Override
    public boolean removeGameEngineCallback(GameEngineCallback gameEngineCallback) {
        if (this.gameEngineCallback != null) {
            this.gameEngineCallback = null;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Collection<Player> getAllPlayers() {
        return this.listOfPlayers.values();
    }
}
