package baseball;

import java.util.Random;

public class Number {
    private final static int NUMBERLENGTH = 3;
    int[] number = new int[NUMBERLENGTH];

    public Number(){ generateRandomNumber(); }

    public Number(String input){
        for(int i = 0; i < NUMBERLENGTH; i++) number[i] = Character.getNumericValue(input.charAt(i));
    }

    void generateRandomNumber(){
        Random intGenerator = new Random();
        //generating random number
        for (int i = 0; i < NUMBERLENGTH; i++) {
            this.number[i] = intGenerator.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {   //중복 제거
                if (this.number[j] == this.number[i]) i--;
            }
        }

    }

}

