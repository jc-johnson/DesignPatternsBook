package Command_Pattern.Vendor_Classes;

/**
 * Created by Jordan on 7/6/2016.
 */
public class CeilingFan {

    public void on(){
        System.out.println("Celing fan on!");
    }

    public void high(){
        System.out.println("Celing fan on high!");
    }

    public void medium(){}

    public void low(){}

    public void off(){
        System.out.println("Ceiling fan is off!");
    }

    public void getSpeed(){}
}
