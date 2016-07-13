package Command_Pattern.Commands;

import Command_Pattern.Command;
import Command_Pattern.Vendor_Classes.GarageDoor;

/**
 * Created by Jordan on 7/12/2016.
 */
public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    public void undo() {
        garageDoor.down();
    }
}
