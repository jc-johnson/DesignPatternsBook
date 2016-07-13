package Command_Pattern;

import Command_Pattern.Commands.GarageDoorOpenCommand;
import Command_Pattern.Commands.LightOnCommand;
import Command_Pattern.Vendor_Classes.GarageDoor;
import Command_Pattern.Vendor_Classes.Light;

/**
 * Created by Jordan on 7/6/2016.
 */
public class GarageRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Bright");
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
