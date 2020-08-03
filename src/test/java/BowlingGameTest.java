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
}
