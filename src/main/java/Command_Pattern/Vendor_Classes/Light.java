package Command_Pattern.Vendor_Classes;

/**
 * Created by Jordan on 7/6/2016.
 */
public class Light {

    public Light(String s) {
        System.out.println("This is " + s);
    }

    public void on(){
        System.out.println("Light is On");
    }

    public void off(){
        System.out.println("Light is Off");
    }
}
