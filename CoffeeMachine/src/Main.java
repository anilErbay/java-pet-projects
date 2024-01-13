public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(1000, 200, 150, 10);
        CoffeeMachineUI coffeeMachineUI = new CoffeeMachineUI(coffeeMachine);
        coffeeMachineUI.start();
    }
}
