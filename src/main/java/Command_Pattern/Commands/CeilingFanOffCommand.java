package Command_Pattern.Commands;

import Command_Pattern.Command;
import Command_Pattern.Vendor_Classes.CeilingFan;

/**
 * Created by Jordan on 7/12/2016.
 */
public class CeilingFanOffCommand implements Command{

    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }


    public void execute() {
        ceilingFan.off();
    }

    public void undo() {
        ceilingFan.on();
    }
}
