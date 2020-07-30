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
            ball_count = ball(answer, input);

            if(strike_count != 0) System.out.print(strike_count + " 스트라이크 ");
            if(ball_count != 0) System.out.print(ball_count + " 볼 ");
            if(strike_count == 0 && ball_count == 0) System.out.print("포볼");
            System.out.println();

            if(strike_count == 3){
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            }
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
                System.out.print("숫자를 입력해주세요 : ");
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

    static int ball(int[] answer, int[] input){
        int result = 0;
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < input.length; j++){
                if(i != j && answer[i] == input[j]) result++;
            }
        }
        return result;
    }

    public static void main(String[] args){

        while(on_play == 1){
            start_game();

            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            on_play = scan.nextInt();
        }

        scan.close();
    }
}