import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private String[] moves;
    private GameUI gameUI;

    public GameLogic() {
        this.gameUI = new GameUI();
        this.moves = new String[]{"r", "p", "s"};
    }

    public String getComputerMove() {
        String computerMove = moves[new Random().nextInt(moves.length)];
        System.out.println(" >>> Computer played: " + computerMove);
        return computerMove;
    }

    public String getPlayerMove() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" >>> Your move ? (r ,p or s ): ");
        String playerMove = scan.nextLine();
        System.out.println(" >>> You played: " + playerMove);
        return playerMove;
    }

    public void play() {
        String playerMove = getPlayerMove();
        String computerMove = getComputerMove();


        if (playerMove.equals(computerMove)) {
            gameUI.tie();
        } else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                gameUI.youLose();
            } else if (computerMove.equals("s")) {
                gameUI.youWin();
            }
        } else if (playerMove.equals("p")) {
            if (computerMove.equals("r")) {
                gameUI.youWin();
            } else if (computerMove.equals("s")) {
                gameUI.youLose();
            }
        } else if (playerMove.equals("s")) {
            if (computerMove.equals("r")) {
                gameUI.youLose();
            } else if (computerMove.equals("p")) {
                gameUI.youWin();
            }
        }
    }
}
