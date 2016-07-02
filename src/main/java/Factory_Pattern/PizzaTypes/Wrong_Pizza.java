package Factory_Pattern.PizzaTypes;

import Factory_Pattern.Pizza;
import Factory_Pattern.PizzaTypes.CheesePizza;
import Factory_Pattern.PizzaTypes.GreekPizza;
import Factory_Pattern.PizzaTypes.PepperoniPizza;

/**
 * Created by Jordan on 7/1/2016.
 */
public class Wrong_Pizza {

    public Pizza orderPizza(String type){

        Pizza pizza = null;

        // varies
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        // stays the same
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public void prepare(){

    }

    public void bake(){

    }

    public void cut(){

    }

    public void box(){

    }

}
