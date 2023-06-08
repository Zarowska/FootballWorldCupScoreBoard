package com.zarowoks.worldcup;

public class ParserInputData {

    public String parseHomeTeamName(String input) {
        String[] parts = input.split("-");
        String firstPartOfString = parts[0].trim();
        String[] secondtPartOfString = firstPartOfString.split("\\.");
        String homeTeamName = secondtPartOfString[1].trim();
        return homeTeamName;
    }

    public String parseAwayTeamName(String input) {
        String[] parts = input.split("-");
        String awayTeamName = parts[1].split(":")[0].trim();
        return awayTeamName;
    }

    public int parseHomeTeamScore(String input) {
        String[] parts = input.split(":");
        String score = parts[1].split("–")[0].trim();
        return Integer.parseInt(score);
    }

    public int parseAwayTeamScore(String input) {
        String[] parts = input.split(":");
        String score = parts[1].split("–")[1].trim();
        return Integer.parseInt(score);
    }

}
