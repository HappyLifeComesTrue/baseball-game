package baseball;

public class BallCounter {

    public static BallCount count(Number answer, Number input){
        int strike = 0;
        int ball = 0;

        //count strike
        for(int i = 0; i < 3; i++){
            if(answer.number[i] == input.number[i]) strike++;
        }

        //count ball
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i != j && answer.number[i] == input.number[j]) ball++;
            }
        }

        return new BallCount(strike,ball);  //temp

    }
}


