package com.zarowoks.worldcup;

import java.util.ArrayList;
import java.util.Collections;
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

    public List<GameBoard> getSummary() {
        List<GameBoard> sortedGames = new ArrayList<>(games);

        Collections.sort(sortedGames, (g1, g2) -> {
            int compareByScore = Integer.compare(g2.getTotalScore(), g1.getTotalScore());
            if (compareByScore == 0) {
                return games.indexOf(g2) - games.indexOf(g1);
            }
            return compareByScore;
        });
        return sortedGames;
    }
}
