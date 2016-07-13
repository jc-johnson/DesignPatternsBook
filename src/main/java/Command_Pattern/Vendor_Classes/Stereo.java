package Command_Pattern.Vendor_Classes;

/**
 * Created by Jordan on 7/6/2016.
 */
public class Stereo {

    public Stereo(String s) {
        System.out.println(s);
    }

    public void on(){
        System.out.println("Turing Stereo On");
    }

    public void off(){
        System.out.println("Stereo turning off");
    }

    public void setCd(){
        System.out.println("Setting CD");
    }

    public void setDvd(){}

    public void setRadio(){}

    public void setVolume(){
        System.out.println("Setting Volume");
    }
}
