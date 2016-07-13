package Command_Pattern.Commands;

import Command_Pattern.Command;
import Command_Pattern.Vendor_Classes.CeilingFan;

import javax.swing.*;

/**
 * Created by Jordan on 7/7/2016.
 */
public class CeilingFanOnCommand implements Command{

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.on();
    }

    public void undo() {
        ceilingFan.off();
    }
}
