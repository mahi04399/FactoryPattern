package Creator;

import Product.Chicago.ChicagoStyleCheesePizza;
import Product.Chicago.ChicagoStyleClamPizza;
import Product.Chicago.ChicagoStylePepperoniPizza;
import Product.Chicago.ChicagoStyleVeggiePizza;
import Product.NY.NYStyleCheesePizza;
import Product.NY.NYStyleClamPizza;
import Product.NY.NYStylePepperoniPizza;
import Product.NY.NYStyleVeggiePizza;
import Product.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> new ChicagoStyleVeggiePizza();
        };
    }
}
