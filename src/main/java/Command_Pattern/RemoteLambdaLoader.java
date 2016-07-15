package Command_Pattern;

import Command_Pattern.Vendor_Classes.Light;
import Command_Pattern.Vendor_Classes.RemoteControl;

/**
 * Created by jordan on 7/15/16.
 */
public class RemoteLambdaLoader {

    public static void main(String[] args) {
        final Light livingRoomLight = new Light("Living Room");
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(0, () -> {
            livingRoomLight.on();
        }, () -> {
            livingRoomLight.off();
        });
    }
}
