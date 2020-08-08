package baseball;

public class BallCount {
    private int strike;
    private int ball;

    public BallCount(int strike, int ball){
        this.strike = strike;
        this.ball = ball;
    }

    boolean isStrikeOut(){
        return strike==3;
    }

    int getStrike(){
        return this.strike;
    }

    int getBall(){
        return this.ball;
    }

}
