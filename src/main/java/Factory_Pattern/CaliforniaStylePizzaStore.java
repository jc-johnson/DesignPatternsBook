package Factory_Pattern;

import Factory_Pattern.Pizza;
import Factory_Pattern.PizzaStore;
import Factory_Pattern.SimplePizzaFactory;

/**
 * Created by Jordan on 7/1/2016.
 */
public class CaliforniaStylePizzaStore extends PizzaStore {


    CaliforniaStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;


        /*if (type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new CalforniaStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new CaliforniaStyleVeggiePizza();
        }*/
        return pizza;
    }
}
