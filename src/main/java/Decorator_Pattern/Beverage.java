package Decorator_Pattern;

/**
 * Created by Jordan on 6/29/2016.
 */
public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};

    Size size = Size.TALL;

    public String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }


    // Other methods
}
