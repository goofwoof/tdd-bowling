import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {
    @Test
    void should_return_300_when_caculate_score_given_12_strike(){
        //Given
        int[] line = {10, 10, 10 , 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        //When
        int score = new BowlingGame(line).caculateScore();
        //Then
        assertEquals(300, score);
    }

    @Test
    void should_return_150_when_caculate_score_given_21_spare(){
        //Given
        int[] line = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        //When
        int score = new BowlingGame(line).caculateScore();
        //Then
        assertEquals(150, score);
    }

    @Test
    void should_return_210_when_caculate_score_given_5_strike_and_5_spare(){
        //Given
        int[] line = {10, 10, 10, 10, 10, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        //When
        int score = new BowlingGame(line).caculateScore();
        //Then
        assertEquals(210, score);
    }


    @Test
    void should_return_60_when_caculate_score_given_no_strike_and_no_spare(){
        //Given
        int[] line = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        //When
        int score = new BowlingGame(line).caculateScore();
        //Then
        assertEquals(60, score);
    }
}
