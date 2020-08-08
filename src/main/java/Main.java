import ingame.Game;
import ui.InputHandler;

public class Main {

    static boolean requestRestart(){
        return InputHandler.requestRestartInput();
    }

    public static void main(String[] args) {
        do{
            Game game = new Game();
            game.start();
        }while(requestRestart());
    }
}
