public class BowlingGame {
    private final int FRAME_MAX = 10;
    private final int STRIKE = 10;
    private final int SPARE = 10;
    int[] line;

    public BowlingGame(int[] line) {
        this.line = line;
    }

    public int caculateScore() throws Exception {
        int frame = 1;
        int score = 0;
        boolean cacuEndFlag = false;
        for (int throwFlag = 0; throwFlag < line.length; throwFlag++) {
            int frameScore = line[throwFlag] + line[throwFlag + 1];
            score += frameScore;

            if(line[throwFlag] == STRIKE){
                score += line[throwFlag + 2];
                if(throwFlag + 3 == line.length){
                    cacuEndFlag = true;
                }
            }
            else if(frameScore == SPARE){
                score +=  line[throwFlag + 2];
                if(throwFlag + 3 == line.length){
                    cacuEndFlag = true;
                }
                throwFlag++;
            }
            else{
                if(throwFlag + 2 == line.length){
                    cacuEndFlag = true;
                }
                throwFlag++;
            }
            frame++;
            if(frame > FRAME_MAX){
                if(!cacuEndFlag){
                    throw new Exception("given over throw");
                }
                break;
            }
        }
        return score;
    }
}
