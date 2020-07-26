import java.util.Scanner;

public class Baseball {
    static int on_play = 1;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        while(on_play == 1){
            //start_game();

            while (true){
                try{
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    on_play = scan.nextInt();
                    break;
                }catch (Exception e){
                    System.out.println("잘못된 입력 값입니다.");
                }
            }

        }

        scan.close();
    }
}