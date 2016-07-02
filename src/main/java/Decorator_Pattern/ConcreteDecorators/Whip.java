package Decorator_Pattern.ConcreteDecorators;

import Decorator_Pattern.Beverage;
import Decorator_Pattern.CondimentDecorator;

/**
 * Created by Jordan on 6/29/2016.
 */
public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + .89;
    }

    public Size getSize(){
        return beverage.getSize();
    }
}
