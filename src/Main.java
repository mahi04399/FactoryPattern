import Creator.NYPizzaStore;
import Creator.PizzaStore;
import Product.Pizza;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("pepperoni");

        System.out.println("Your Prepared Order : " + pizza.getName());
    }
}