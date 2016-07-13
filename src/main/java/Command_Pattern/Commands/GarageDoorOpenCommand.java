package Command_Pattern.Commands;

import Command_Pattern.Command;
import Command_Pattern.Vendor_Classes.GarageDoor;

/**
 * Created by Jordan on 7/6/2016.
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.door = garageDoor;
    }

    public void execute() {
        door.up();
    }

    public void undo() {
        door.down();
    }
}
