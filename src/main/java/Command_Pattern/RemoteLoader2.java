package Command_Pattern;

import Command_Pattern.Commands.CeilingFanHighCommand;
import Command_Pattern.Commands.CeilingFanMediumCommand;
import Command_Pattern.Commands.CeilingFanOffCommand;
import Command_Pattern.Vendor_Classes.CeilingFan;

/**
 * Created by jordan on 7/15/16.
 */
public class RemoteLoader2 {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium =
                new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh =
                new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0); // first turn the fan on medium
        remoteControl.offButtonWasPushed(0); // then turn it off
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed(); // undo! it should go back to medium

        remoteControl.onButtonWasPushed(1); // turn it on high this time
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed(); // and, one more undo; it should go back to medium
    }
}
