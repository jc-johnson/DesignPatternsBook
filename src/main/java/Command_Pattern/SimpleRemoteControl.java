package Command_Pattern;

import Command_Pattern.Command;

/**
 * Created by Jordan on 7/6/2016.
 */
public class SimpleRemoteControl {

    Command slot;
    public SimpleRemoteControl(){};

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
