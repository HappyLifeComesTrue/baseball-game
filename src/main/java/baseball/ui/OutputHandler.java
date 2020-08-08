package baseball.ui;
import baseball.BallCount;

public class OutputHandler {
    private static final String REQUEST_RESTART = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. : ";
    private static final String REQUEST_NUMBER = "숫자를 입력해주세요. : ";

    public static void showRestartMessage(){
        System.out.print(REQUEST_RESTART);
    }

    public static void showRequestNumberMessage(){
        System.out.print(REQUEST_NUMBER);
    }

    public static void showBallCount(BallCount ballCount){
        //업데이트 예정. BallCount 객체를 받아 출력할 함수 작성
    }
}
