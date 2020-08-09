package baseball.ui;
import java.util.Scanner;
import baseball.Number;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static Number requestNumber(){
        String userInputString;

        do{
            OutputHandler.showRequestNumberMessage();
            userInputString = scanner.nextLine();
        }while(!isCorrectFormat(userInputString));

        return new Number(userInputString);
    }

    private static boolean isCorrectFormat(String userInput){
        //길이 체크
        if(userInput.length() != 3){
            OutputHandler.showNumberLengthError();
            return false;
        }
        //1~9사이의 숫자 여부 체크
        for(int i = 0; i < userInput.length(); i++){
            char ch = userInput.charAt(i);
            if('0' < ch && ch <= '9') continue;
            else{
                OutputHandler.showRequestOnlyNumberError();
                return false;
            }
        }

        return true;
    }

    public static boolean requestRestart(){
        int input;
        do{
            OutputHandler.showRestartMessage();
            try{
                input = scanner.nextInt();
                scanner.nextLine(); //버퍼 클리어
            }catch(Exception e){
                //숫자가 아닌 경우
                OutputHandler.showWrongMenuError();
                scanner.nextLine(); //버퍼 클리어
                continue;//재입력 요구
            }

            if(input == 1) return true;
            else if(input == 2) return false;
            else{
                //1과 2 이외의 숫자인 경우, 재입력 요구
                OutputHandler.showWrongMenuError();
            }
            
        }while(true);//리턴문에 의해서만 탈출
    }

}
