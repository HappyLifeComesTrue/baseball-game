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
        //업데이트 예정. BallCount 객체를 받아 출력할 함수 작성
    }

}
