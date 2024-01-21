package Creator;

import Product.NY.NYStyleCheesePizza;
import Product.NY.NYStyleClamPizza;
import Product.NY.NYStylePepperoniPizza;
import Product.NY.NYStyleVeggiePizza;
import Product.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> new NYStyleVeggiePizza();
        };
    }
}
