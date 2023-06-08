package com.zarowoks.worldcup;

import java.util.List;

public class FootballWorldCupScoreBoard {

    private static CupBoard cupBoard = new CupBoard();
    private static ParserInputData parserInputData = new ParserInputData();

    public static void main(String[] args) {

        List<String> input = List.of(
                "a. Mexico - Canada: 0 – 5",
                "b. Spain - Brazil: 10 – 2",
                "c. Germany - France: 2 – 2",
                "d. Uruguay - Italy: 6 – 6",
                "e. Argentina - Australia: 3 – 1"
        );

        input.forEach(str ->
                cupBoard.start(
                        parserInputData.parseHomeTeamName(str),
                        parserInputData.parseHomeTeamName(str)
                ).update(
                        parserInputData.parseHomeTeamScore(str),
                        parserInputData.parseAwayTeamScore(str)
                )
        );


        List<GameBoard> result = cupBoard.getSummary();

        result.stream().forEach(e->System.out.println(e));
    }
}
