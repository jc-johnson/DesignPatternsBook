package Decorator_Pattern.ConcreteComponents;

import Decorator_Pattern.Beverage;

/**
 * Created by Jordan on 6/29/2016.
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf";
    }

    public double cost() {
        return .49;
    }
}
