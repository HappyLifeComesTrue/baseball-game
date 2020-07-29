import java.util.Scanner;
import java.util.Random;

public class Baseball {
    static int on_play = 1;
    static Scanner scan = new Scanner(System.in);

    static void start_game() {
        Random intGenerator = new Random();
        int strike = 0;
        int ball = 0;
        int[] answer = new int[3];
        int[] input = new int[3];
        String buffer = null;

        for (int i = 0; i < 3; i++) {
            answer[i] = intGenerator.nextInt(9) + 1;

            for (int j = 0; j < i; j++) {   //중복 제거
                if (answer[j] == answer[i]) i--;
            }
        }

        while (strike != 3) {
            System.out.println("숫자를 입력해주세요.");
            buffer = scan.next();

            for(int i = 0; i < 3; i++){
                input[i] = Character.getNumericValue(buffer.charAt(i));
            }
        }
    }


    public static void main(String[] args){

        while(on_play == 1){
            start_game();

            while (true){
                try{
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    on_play = scan.nextInt();
                }catch (Exception e){
                    System.out.println("잘못된 입력입니다.");
                }
            }
        }

        scan.close();
    }
}