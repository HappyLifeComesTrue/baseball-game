import java.util.Scanner;
import java.util.Random;

public class Baseball {
    static int on_play = 1;
    static Scanner scan = new Scanner(System.in);

    static void start_game() {
        int strike_count = 0;
        int ball_count = 0;
        int[] answer = new int[3];
        int[] input = new int[3];

        answer = generate_number();

        while (strike_count != 3) {
            input = get_input();
            strike_count = strike(answer, input);
        }
    }

    static int[] generate_number(){
        Random intGenerator = new Random();
        int[] result = new int[3];

        for (int i = 0; i < 3; i++) {
            result[i] = intGenerator.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {   //중복 제거
                if (result[j] == result[i]) i--;
            }
        }
        return result;
    }

    static int[] get_input(){
        String buffer;
        while(true){
            try{
                System.out.println("숫자를 입력해주세요.");
                buffer = scan.next();
                break;
            }catch(Exception e){
                System.out.println("잘못된 입력입니다.");
            }
        }
        int[] input = new int[3];

        for(int i = 0; i < 3; i++){
            input[i] = Character.getNumericValue(buffer.charAt(i));
        }
        return input;
    }

    static int strike(int[] answer, int[] input){
        int result = 0;
        for(int i = 0; i < answer.length;i++){
            if(answer[i] == input[i]) result++;
        }
        return result;
    }

    public static void main(String[] args){

        while(on_play == 1){
            start_game();

            while (true) {
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                on_play = scan.nextInt();
            }
        }

        scan.close();
    }
}