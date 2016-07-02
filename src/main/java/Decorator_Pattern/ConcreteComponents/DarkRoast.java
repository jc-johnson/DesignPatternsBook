package Decorator_Pattern.ConcreteComponents;

import Decorator_Pattern.Beverage;

/**
 * Created by Jordan on 6/29/2016.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .89;
    }
}
