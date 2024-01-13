public class GameUI {
    public GameUI() {
    }

    public void displayLogo() {
        System.out.println("=======================================================================================");
        System.out.println("   ROCK                           PAPER                              SCISSORS          ");
        System.out.println("|    _______                 |   _______                       |    _______         ");
        System.out.println("|---'   ____)                | ---'   ____)____                |---'   ____)____    ");
        System.out.println("|      (_____)               |          ______)                |          ______)   ");
        System.out.println("|      (_____)               |          _______)               |       __________)  ");
        System.out.println("|      (____)                |         _______)                |      (____)        ");
        System.out.println("|---.__(___)                 |---.__________)                  |---.__(___)         ");
        System.out.println("=======================================================================================");

    }

    public void displayHomeScreen() {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("1. Play Game");
        System.out.println("2. Exit");
        System.out.print("Choose an option: ");
    }

    public void exit() {
        System.out.println("Exiting the play. Goodbye! =)");
        System.exit(0);
    }

    public void invalid() {
        System.out.println("Invalid option.");
    }

    public void youWin() {
        System.out.println(" >>> You win!");
    }

    public void youLose() {
        System.out.println(" >>> You lose!");
    }

    public void tie() {
        System.out.println(" >>> The game was a tie!");
    }
}
