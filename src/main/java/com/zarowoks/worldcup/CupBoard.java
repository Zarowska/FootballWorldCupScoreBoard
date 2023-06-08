package com.zarowoks.worldcup;

import java.util.ArrayList;
import java.util.List;

public class CupBoard {

    List<GameBoard> games = new ArrayList<>();


    public GameBoard start(String homeTeamName, String awayTeamName) {
        GameBoard game = new GameBoard(homeTeamName, awayTeamName);
        games.add(game);
        return game;

    }

    public void finishGame(GameBoard game) {
        games.remove(game);
    }

//TODO
    public List<GameBoard> getSummary() {
        List<GameBoard> sortedGames = new ArrayList<>();
        return games;
    }
}
