package Command_Pattern.Vendor_Classes;

/**
 * Created by Jordan on 7/6/2016.
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location){
        this.location = location;
        speed = OFF;
    }

    public void on(){
        System.out.println("Celing fan on!");
    }

    public void high(){
        speed = HIGH;
        System.out.println("Celing fan on high!");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println("Ceiling fan on medium!");

    }

    public void low(){
        speed = LOW;
        System.out.println("Ceiling fan on low!");
    }

    public void off(){
        speed = OFF;
        System.out.println("Ceiling fan is off!");
    }

    public int getSpeed(){
        return speed;
    }
}
