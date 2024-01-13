public class CoffeeMachine {
    private int water;
    private int coffeeBeans;
    private int milk;
    private int cups;

    public CoffeeMachine(int water, int coffeeBeans, int milk, int cups) {
        this.water = water;
        this.coffeeBeans = coffeeBeans;
        this.milk = milk;
        this.cups = cups;
    }
    
    public void displayStatus() {
        System.out.println("Coffee Machine Status:");
        System.out.println("Water: " + water + " ml");
        System.out.println("Coffee Beans: " + coffeeBeans + " grams");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Cups: " + cups);
    }

    public void addWater(int amount) {
        water += amount;
        System.out.println("Added " + amount + " ml of water.");
    }

    public void addCoffeeBeans(int amount) {
        coffeeBeans += amount;
        System.out.println("Added " + amount + " grams of coffee beans.");
    }

    public void addMilk(int amount) {
        milk += amount;
        System.out.println("Added " + amount + " ml of milk.");
    }

    public void addCups(int amount) {
        cups += amount;
        System.out.println("Added " + cups + " cups.");
    }

    public void makeCoffee(int waterNeeded, int coffeeBeansNeeded, int milkNeeded) {
        if (water >= waterNeeded && coffeeBeans >= coffeeBeansNeeded && milk >= milkNeeded) {
            System.out.println("Making coffee...");
            water -= waterNeeded;
            coffeeBeans -= coffeeBeansNeeded;
            milk -= milkNeeded;
            cups--;
            System.out.println("Coffee is ready! Enjoy!");
        } else {
            System.out.println("Sorry, not enough resources to make coffee. Please refill!");
        }
    }

}
