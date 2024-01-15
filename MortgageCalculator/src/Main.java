import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mortgage myMort = new Mortgage();
        UI ui = new UI(myMort, scan);

        ui.askPrincipal();
        ui.askAnnualInterestRate();
        ui.askTermInYears();

        myMort.calcMonthlyPayment();
        myMort.displayResult();

        scan.close();
    }
}
