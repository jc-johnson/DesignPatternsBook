package Factory_Pattern.NyPizza;

import Factory_Pattern.Pizza;
import Factory_Pattern.PizzaStore;
import Factory_Pattern.SimplePizzaFactory;

/**
 * Created by Jordan on 7/1/2016.
 */
public class NyStylePizzaStore extends PizzaStore {

    public NyStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    public Pizza createPizza(String type){

        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new NyStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NyStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NyStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NyStyleVeggiePizza();
        }

        return pizza;
    }
}
