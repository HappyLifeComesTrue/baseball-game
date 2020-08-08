import java.util.Random;

public class Number {
    int[] number = new int[3];
    Random intGenerator = new Random();

    public Number(){
        generateRandomNumber();
    }

    public Number(int[] input){
        System.arraycopy(input, 0, this.number, 0, 3);
    }

    void generateRandomNumber(){
        //generating random number
        for (int i = 0; i < 3; i++) {
            this.number[i] = intGenerator.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {   //중복 제거
                if (this.number[j] == this.number[i]) i--;
            }
        }

    }

}

