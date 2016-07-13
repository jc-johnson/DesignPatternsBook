package Command_Pattern.Commands;

import Command_Pattern.Command;
import Command_Pattern.Vendor_Classes.Light;

/**
 * Created by Jordan on 7/7/2016.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
