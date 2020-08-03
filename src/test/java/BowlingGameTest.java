import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class BowlingGameTest {
    @Test
    void should_return_300_when_caculate_score_given_12_strike() throws Exception {
        //Given
        int[] line = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        //When
        int score = new BowlingGame(line).caculateScore();
        //Then
        assertEquals(300, score);
    }

    @Test
    void should_return_150_when_caculate_score_given_21_spare() throws Exception {
        //Given
        int[] line = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        //When
        int score = new BowlingGame(line).caculateScore();
        //Then
        assertEquals(150, score);
    }

    @Test
    void should_return_210_when_caculate_score_given_5_strike_and_5_spare() throws Exception {
        //Given
        int[] line = {10, 10, 10, 10, 10, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        //When
        int score = new BowlingGame(line).caculateScore();
        //Then
        assertEquals(210, score);
    }


    @Test
    void should_return_60_when_caculate_score_given_no_strike_and_no_spare() throws Exception {
        //Given
        int[] line = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        //When
        int score = new BowlingGame(line).caculateScore();
        //Then
        assertEquals(60, score);
    }

    @Test
    void should_return_94_when_caculate_score_given_no_strike_and_no_spare() throws Exception {
        //Given
        int[] line = {3, 3, 10, 3, 3, 5, 5, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        //When
        int score = new BowlingGame(line).caculateScore();
        //Then
        assertEquals(94, score);
    }

    @Test
    void should_return_error_when_caculate_score_given_over_throw(){
        //Given
        int[] line = {3, 3, 10, 3, 3, 5, 5, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        //When
        try {
            int score = new BowlingGame(line).caculateScore();
        } catch (Exception e) {
            //Then
            assertEquals("given over throw", e.getMessage());
            return;
        }
        fail("expected for GrammarException of The vertex args is lack.");
    }

    @Test
    void should_return_error_when_caculate_score_given_impossible_line(){
        //Given
        int[] line = {3, 10, 3, 3, 5, 5, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        //When
        try {
            int score = new BowlingGame(line).caculateScore();
        } catch (Exception e) {
            //Then
            assertEquals("given impossible line", e.getMessage());
            return;
        }
        fail("expected for GrammarException of The vertex args is lack.");
    }
}
