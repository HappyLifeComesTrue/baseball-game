import baseball.Number;
import baseball.*;
import baseball.ui.*;

public class Main {

    static boolean requestRestart(){
        return InputHandler.requestRestart();
    }

    public static void main(String[] args) {
        do{
            Game game = new Game();
            //game.start();
        }while(false/*테스트 시 false, requestRestart()*/);
    }
}
