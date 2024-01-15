import java.text.NumberFormat;

public class Mortgage {
    private static final int MONTHS_IN_A_YEAR = 12;
    private double principal;
    private float annualInterestRate;
    private int termInYears;

    public Mortgage() {
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setTermInYears(int termInYears) {
        this.termInYears = termInYears;
    }

    public float calcMonthlyInterestRate() {
        return annualInterestRate / MONTHS_IN_A_YEAR;
    }

    public int calcNumberOfPayments() {
        return termInYears * MONTHS_IN_A_YEAR;
    }

    public double calcMonthlyPayment() {
        float monthlyInterestRate = calcMonthlyInterestRate();
        int numberOfPayments = calcNumberOfPayments();

        return (principal * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    }

    public void displayResult() {
        System.out.println("Monthly Payment     : " + NumberFormat.getCurrencyInstance().format(calcMonthlyPayment()));
        System.out.println("Total Payment Amount: " + NumberFormat.getCurrencyInstance().format(calcMonthlyPayment() * calcNumberOfPayments()));
    }
}
