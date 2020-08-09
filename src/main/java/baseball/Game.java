package baseball;
import baseball.ui.*;

public class Game {
    private Number answer = new Number();
    private BallCount ballCount;

    public void start(){
        do{
            Number userInputNumber = InputHandler.requestNumber();
            ballCount = BallCounter.count(answer, userInputNumber);
            OutputHandler.showBallCount(ballCount);
        }while(!ballCount.isStrikeOut());
        OutputHandler.showGameEndMessage();
    }

}
