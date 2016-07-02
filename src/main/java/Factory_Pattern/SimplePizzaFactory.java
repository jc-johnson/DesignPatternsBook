package Factory_Pattern;

import Factory_Pattern.PizzaTypes.CheesePizza;
import Factory_Pattern.PizzaTypes.ClamPizza;
import Factory_Pattern.PizzaTypes.PepperoniPizza;
import Factory_Pattern.PizzaTypes.VeggiePizza;

/**
 * Created by Jordan on 7/1/2016.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
