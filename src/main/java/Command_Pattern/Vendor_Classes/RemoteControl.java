package Command_Pattern.Vendor_Classes;

import Command_Pattern.Command;
import Command_Pattern.Commands.NoCommand;

/**
 * Created by Jordan on 7/7/2016.
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        // our remote has 7 on and off buttons
        onCommands = new Command[7];
        offCommands = new Command[7];

        // initialize empty remote
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonwasPushed(int slot){
        offCommands[slot].execute();
    }

    // overriding toString() to print out each slot
    // and its corresponding command
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n----- Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() +
                "  " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
