package com.zarowoks.worldcup;

import java.time.LocalDateTime;
import java.util.Objects;

public class GameBoard {

    private String homeTeamName;
    private String awayTeamName;
    private int homeTeamScore;
    private int awayTeamScore;


    public GameBoard(String homeTeamName, String awayTeamName) {
        this.homeTeamName = homeTeamName;
        this.awayTeamName = awayTeamName;
        homeTeamScore = 0;
        awayTeamScore = 0;

    }

    public GameBoard update(int scoreHomeTeam, int scoreAwayTeam) {
        this.homeTeamScore = scoreHomeTeam;
        this.awayTeamScore = scoreAwayTeam;
        return this;
    }

    public int getTotalScore() {
        return homeTeamScore + awayTeamScore;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    @Override
    public String toString() {
        return homeTeamName + " " + homeTeamScore + " - " + awayTeamName + " " + awayTeamScore;

    }


    @Override
    public int hashCode() {
        return Objects.hash(homeTeamName, homeTeamScore, awayTeamName, awayTeamScore);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameBoard gameBoard = (GameBoard) o;
        return homeTeamName.equals(gameBoard.homeTeamName)
                && awayTeamName.equals(gameBoard.awayTeamName)
                && homeTeamScore == gameBoard.homeTeamScore
                && awayTeamScore == gameBoard.awayTeamScore
                ;

    }


}
