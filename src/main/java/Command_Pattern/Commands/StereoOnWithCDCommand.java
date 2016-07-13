package Command_Pattern.Commands;

import Command_Pattern.Command;
import Command_Pattern.Vendor_Classes.Stereo;

/**
 * Created by Jordan on 7/7/2016.
 */
public class StereoOnWithCDCommand implements Command {

    // Each command needs and object to work with
    Stereo stereo;

    // Setting object to work with
    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume();
    }

    public void undo() {
        stereo.off();
    }
}
