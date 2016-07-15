package Command_Pattern.Vendor_Classes;

/**
 * Created by jordan on 7/15/16.
 */
public class TV {

    public TV(String s){
        System.out.println("This TV is " + s);
    }

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }
}
