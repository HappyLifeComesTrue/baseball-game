package baseball.ui;
import baseball.BallCount;

public class OutputHandler {
    private static final String REQUEST_RESTART = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. : ";
    private static final String REQUEST_NUMBER = "숫자를 입력해주세요. : ";
    private static final String REQUEST_3_NUMBER = "3자리만 입력해주세요.";
    private static final String REQUEST_ONLY_NUMBER = "1~9사이의 숫자만 입력해주세요. ";
    private static final String REQUEST_WRONG_MENU = "유효하지 않은 선택입니다.";

    public static void showRestartMessage(){
        System.out.print(REQUEST_RESTART);
    }

    public static void showRequestNumberMessage(){
        System.out.print(REQUEST_NUMBER);
    }

    public static void showNumberLengthError(){ System.out.println(REQUEST_3_NUMBER); }

    public static void showWrongMenuError(){ System.out.println(REQUEST_WRONG_MENU); }

    public static void showRequestOnlyNumberError(){
        System.out.println(REQUEST_ONLY_NUMBER);
    }

    public static void showBallCount(BallCount ballCount){
        int strike = ballCount.getStrike();
        int ball = ballCount.getBall();
        if(strike != 0) System.out.print(strike + " 스트라이크 ");
        if(ball != 0) System.out.print(ball + " 볼");
        if(strike == 0 && ball == 0) System.out.print("포볼");
        System.out.println();

    }

}
