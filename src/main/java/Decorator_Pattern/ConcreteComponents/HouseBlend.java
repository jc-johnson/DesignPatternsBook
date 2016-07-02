package Decorator_Pattern.ConcreteComponents;

import Decorator_Pattern.Beverage;

/**
 * Created by Jordan on 6/29/2016.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
