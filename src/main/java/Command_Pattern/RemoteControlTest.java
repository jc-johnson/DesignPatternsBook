package Command_Pattern;

import Command_Pattern.Commands.LightOnCommand;
import Command_Pattern.Vendor_Classes.Light;

/**
 * Created by Jordan on 7/6/2016.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Bright");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();


    }
}
