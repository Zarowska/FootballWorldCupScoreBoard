package com.zarowoks.worldcup;

import java.util.List;

public class FootballWorldCupScoreBoard {

    private static CupBoard cupBoard = new CupBoard();
    private static ParserInputData parserInputData = new ParserInputData();

    public static void main(String[] args) throws Exception {

        String inputString1 = "a. Mexico - Canada: 0 – 5";
        String inputString2 = "b. Spain - Brazil: 10 – 2";
        String inputString3 = "c. Germany - France: 2 – 2";
        String inputString4 = "d. Uruguay - Italy: 6 – 6";
        String inputString5 = "e. Argentina - Australia: 3 – 1";

        cupBoard.start(parserInputData.parseHomeTeamName(inputString1), parserInputData.parseHomeTeamName(inputString1)).update(parserInputData.parseHomeTeamScore(inputString1), parserInputData.parseAwayTeamScore(inputString1));
        cupBoard.start(parserInputData.parseHomeTeamName(inputString2), parserInputData.parseHomeTeamName(inputString2)).update(parserInputData.parseHomeTeamScore(inputString2), parserInputData.parseAwayTeamScore(inputString2));
        cupBoard.start(parserInputData.parseHomeTeamName(inputString3), parserInputData.parseHomeTeamName(inputString3)).update(parserInputData.parseHomeTeamScore(inputString3), parserInputData.parseAwayTeamScore(inputString3));
        cupBoard.start(parserInputData.parseHomeTeamName(inputString4), parserInputData.parseHomeTeamName(inputString4)).update(parserInputData.parseHomeTeamScore(inputString4), parserInputData.parseAwayTeamScore(inputString4));
        cupBoard.start(parserInputData.parseHomeTeamName(inputString5), parserInputData.parseHomeTeamName(inputString5)).update(parserInputData.parseHomeTeamScore(inputString5), parserInputData.parseAwayTeamScore(inputString5));

        List<GameBoard> result = cupBoard.getSummary();

        result.stream().forEach(e->System.out.println(e));
    }
}
