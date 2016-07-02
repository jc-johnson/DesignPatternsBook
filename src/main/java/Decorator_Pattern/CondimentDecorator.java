package Decorator_Pattern;

/**
 * Created by Jordan on 6/29/2016.
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

    public abstract Size getSize();
}
