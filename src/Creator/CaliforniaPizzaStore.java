package Creator;

import Product.California.CaliforniaStyleCheesePizza;
import Product.California.CaliforniaStyleClamPizza;
import Product.California.CaliforniaStylePepperoniPizza;
import Product.California.CaliforniaStyleVeggiePizza;
import Product.NY.NYStyleCheesePizza;
import Product.NY.NYStyleClamPizza;
import Product.NY.NYStylePepperoniPizza;
import Product.NY.NYStyleVeggiePizza;
import Product.Pizza;

public class CaliforniaPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CaliforniaStyleCheesePizza();
            case "clam" -> new CaliforniaStyleClamPizza();
            case "pepperoni" -> new CaliforniaStylePepperoniPizza();
            default -> new CaliforniaStyleVeggiePizza();
        };
    }
}
