import java.util.Scanner;

public class UI {
    private static final int DIVIDE_BY_100 = 100;
    private Mortgage mortgage;
    private Scanner scan;

    public UI(Mortgage mort, Scanner scan) {
        this.mortgage = mort;
        this.scan = new Scanner(System.in);
    }

    public void askPrincipal() {
        System.out.print("Enter principal amount: ");
        double principal = scan.nextDouble();
        mortgage.setPrincipal(principal);
    }

    public void askAnnualInterestRate() {
        System.out.print("Enter annual interest rate (%): ");
        float annualInterestRate = scan.nextFloat();
        mortgage.setAnnualInterestRate(annualInterestRate / DIVIDE_BY_100);
    }

    public void askTermInYears() {
        System.out.print("Enter the term in years: ");
        int years = scan.nextInt();
        mortgage.setTermInYears(years);
    }
}
