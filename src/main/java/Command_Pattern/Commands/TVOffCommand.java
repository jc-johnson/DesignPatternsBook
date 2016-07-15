package Command_Pattern.Commands;

import Command_Pattern.Command;
import Command_Pattern.Vendor_Classes.TV;

/**
 * Created by jordan on 7/15/16.
 */
public class TVOffCommand implements Command{
    TV tv;

    public TVOffCommand(TV tv){
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }

    public void undo() {
        tv.on();
    }
}
