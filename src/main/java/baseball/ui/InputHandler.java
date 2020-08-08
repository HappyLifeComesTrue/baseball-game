package baseball.ui;
import java.util.Scanner;
import baseball.Number;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static Number requestNumber(){
        return new Number();    //임시 코드. 사용자로부터 받은 입력을 포맷에 맞는지 검토 후 Number 객체로 변환, 리턴하는 바디 필요
    }

    public static boolean requestRestart(){
        return false;
    }

}
