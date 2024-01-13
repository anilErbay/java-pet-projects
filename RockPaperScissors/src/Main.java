import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GameLogic game = new GameLogic();
        GameUI gameUI = new GameUI();

        gameUI.displayLogo();
        while (true) {
            gameUI.displayHomeScreen();

            int option = scan.nextInt();
            switch (option) {
                case 1:
                    game.play();
                    break;
                case 2:
                    gameUI.exit();
                    break;
                default:
                    gameUI.invalid();
            }
        }
    }
}
