package Factory_Pattern;

import Factory_Pattern.ChicagoPizza.ChicagoStylePizzaStore;
import Factory_Pattern.NyPizza.NyStylePizzaStore;

/**
 * Created by Jordan on 7/1/2016.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = null;

        PizzaStore nyStore = new NyStylePizzaStore(factory);
        PizzaStore chicagoStore = new ChicagoStylePizzaStore(factory);

        Pizza pizza = nyStore.orderPizza("cheese");
        nyStore.createPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        chicagoStore.createPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
