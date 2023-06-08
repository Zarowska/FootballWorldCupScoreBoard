package com.zarowoks.worldcup;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballWorldCupScoreBoardTest {

    CupBoard cupBoard = new CupBoard();


    @Test
    void printGameSummary() {
        String board1Summary = cupBoard.start("Mexico", "Canada").update(0, 5).toString();
        String board2Summary = cupBoard.start("Spain", "Brazil").update(10, 2).toString();
        String board3Summary = cupBoard.start("Germany", "France").update(2, 2).toString();
        String board4Summary = cupBoard.start("Uruguay", "Italy").update(6, 6).toString();
        String board5Summary = cupBoard.start("Argentina", "Australia").update(3, 1).toString();

        assertEquals("Mexico 0 - Canada 5", board1Summary);
        assertEquals("Spain 10 - Brazil 2", board2Summary);
        assertEquals("Germany 2 - France 2", board3Summary);
        assertEquals("Uruguay 6 - Italy 6", board4Summary);
        assertEquals("Argentina 3 - Australia 1", board5Summary);
    }


    @Test
    void summaryShouldBeSortedByTotalScoreAndAddedTime() {
        GameBoard board1 = cupBoard.start("Mexico", "Canada").update(0, 5);
        GameBoard board2 = cupBoard.start("Spain", "Brazil").update(10, 2);
        GameBoard board3 = cupBoard.start("Germany", "France").update(2, 2);
        GameBoard board4 = cupBoard.start("Uruguay", "Italy").update(6, 6);
        GameBoard board5 = cupBoard.start("Argentina", "Australia").update(3, 1);

        List<GameBoard> expected = List.of(
                board4,
                board2,
                board1,
                board5,
                board3
        );

        List<GameBoard> actual = cupBoard.getSummary();
        assertEquals(expected, actual);
    }

}
