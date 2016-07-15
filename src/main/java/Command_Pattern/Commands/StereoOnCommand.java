package Command_Pattern.Commands;

import Command_Pattern.Command;
import Command_Pattern.Vendor_Classes.Stereo;

/**
 * Created by jordan on 7/15/16.
 */
public class StereoOnCommand implements Command{

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
    }

    public void undo() {
        stereo.off();
    }
}
