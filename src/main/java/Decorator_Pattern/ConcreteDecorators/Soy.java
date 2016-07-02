package Decorator_Pattern.ConcreteDecorators;

import Decorator_Pattern.Beverage;
import Decorator_Pattern.CondimentDecorator;

/**
 * Created by Jordan on 6/29/2016.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.description + ", Soy";
    }

    public double cost() {
        return beverage.cost() + .20;
    }

    public Size getSize(){
        return beverage.getSize();
    }
}
