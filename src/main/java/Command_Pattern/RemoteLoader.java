package Command_Pattern;

import Command_Pattern.Commands.*;
import Command_Pattern.Vendor_Classes.*;

/**
 * Created by Jordan on 7/7/2016.
 */
public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRootLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn =
                new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand =
                new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp =
                new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown =
                new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand steroOff =
                new StereoOffCommand(stereo);

        // loading all of our commands into remote slots
        remoteControl.setCommand(0, livingRootLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCD, steroOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonwasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonwasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonwasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonwasPushed(3);
    }
}
