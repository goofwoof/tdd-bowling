import java.util.Arrays;
import java.util.function.IntConsumer;

public class BowlingGame {
    private final int FRAME_MAX = 10;
    private final int SCORE_MAX = 3;
    private final int STRIKE = 10;
    private final int SPARE = 10;
    int[] line;

    public BowlingGame(int[] line) {
        this.line = line;
    }

    public int caculateScore(){
        int frame = 1;
        int score = 0;
        for (int throwFlag = 0; throwFlag < line.length; throwFlag++) {
            if(line[throwFlag] == STRIKE){
                score +=  line[throwFlag] + line[throwFlag+1] + line[throwFlag+2];
                frame++;
            }
            if(frame > FRAME_MAX){
                break;
            }
        }
        return score;
    }
}
