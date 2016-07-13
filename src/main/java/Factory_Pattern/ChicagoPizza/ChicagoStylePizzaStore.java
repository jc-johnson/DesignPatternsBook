package Factory_Pattern.ChicagoPizza;

import Factory_Pattern.Pizza;
import Factory_Pattern.PizzaStore;
import Factory_Pattern.SimplePizzaFactory;

/**
 * Created by Jordan on 7/1/2016.
 */
public class ChicagoStylePizzaStore extends PizzaStore {


    public ChicagoStylePizzaStore(SimplePizzaFactory factory){
        super(factory);
    }


    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
