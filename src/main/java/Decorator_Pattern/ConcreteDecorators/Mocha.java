package Decorator_Pattern.ConcreteDecorators;

import Decorator_Pattern.Beverage;
import Decorator_Pattern.CondimentDecorator;

/**
 * Created by Jordan on 6/29/2016.
 */
public class Mocha extends CondimentDecorator{

    // Instance variable to hold the beverage we're wrapping
    Beverage beverage;

    // Passing the beverage that we're wrapping to the constructor
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + .20;
    }

    public Size getSize(){
        return beverage.getSize();
    }
}
