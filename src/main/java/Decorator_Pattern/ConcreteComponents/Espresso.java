package Decorator_Pattern.ConcreteComponents;

import Decorator_Pattern.Beverage;

/**
 * Created by Jordan on 6/29/2016.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }
    public double cost() {
        return 1.99;
    }
}
