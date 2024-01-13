import java.util.Scanner;

public class CoffeeMachineUI {
    private CoffeeMachine coffeeMachine;

    public CoffeeMachineUI(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            displayOptions();
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    coffeeMachine.displayStatus();
                    break;
                case 2:
                    addWaterUI();
                    break;
                case 3:
                    addCoffeeBeansUI();
                    break;
                case 4:
                    addMilkUI();
                    break;
                case 5:
                    addCupsUI();
                    break;
                case 6:
                    makeCoffeeUI();
                    drawCoffee();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public void addWaterUI() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of water to add (in ml) : ");
        int waterAmount = scan.nextInt();
        coffeeMachine.addWater(waterAmount);
    }

    private void addCoffeeBeansUI() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of coffee beans to add (in grams) : ");
        int coffeeBeansAmount = scan.nextInt();
        coffeeMachine.addCoffeeBeans(coffeeBeansAmount);
    }

    public void addMilkUI() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of milk to add (in ml) : ");
        int milkAmount = scan.nextInt();
        coffeeMachine.addMilk(milkAmount);
    }

    public void addCupsUI() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of cups to add: ");
        int cupsAmount = scan.nextInt();
        coffeeMachine.addCups(cupsAmount);
    }

    public void makeCoffeeUI() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of water needed (in ml) : ");
        int waterNeeded = scan.nextInt();
        System.out.print("Enter the amount of coffee beans needed (in grams) : ");
        int coffeeBeansNeeded = scan.nextInt();
        System.out.print("Enter the amount of milk needed (in ml) : ");
        int milkNeeded = scan.nextInt();
        coffeeMachine.makeCoffee(waterNeeded, coffeeBeansNeeded, milkNeeded);
    }

    public void displayOptions() {
        System.out.println("\nOptions:");
        System.out.println("1. Display Machine Status");
        System.out.println("2. Add Water");
        System.out.println("3. Add Coffee Beans");
        System.out.println("4. Add Milk");
        System.out.println("5. Add Cups");
        System.out.println("6. Make Coffee");
        System.out.println("0. Exit");
    }

    public void exit() {
        System.out.println("Exiting Coffee Machine Simulator. Goodbye!");
        System.exit(0);
    }

    public static void drawCoffee() {
        System.out.println("   ( ( ( ( ( )");
        System.out.println("      \\ \\ \\ \\ |");
        System.out.println("       \\ \\ \\  \\");
        System.out.println("        \\ \\ \\  \\");
        System.out.println("         \\ \\ \\   )");
        System.out.println("           ) ) ) /");
        System.out.println("          ( ( ( (");
        System.out.println("            \\ \\ \\");
        System.out.println("             \\ \\ \\");
        System.out.println("              \\ \\ \\");
        System.out.println("               ) ) )");
        System.out.println("              ( ( (");
    }
}
