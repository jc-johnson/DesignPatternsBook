package Factory_Pattern.NyPizza;

import Factory_Pattern.Pizza;

/**
 * Created by Jordan on 7/1/2016.
 */
public class NyStyleCheesePizza extends Pizza {

    public NyStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
