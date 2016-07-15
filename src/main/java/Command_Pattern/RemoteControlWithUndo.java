package Command_Pattern;

import Command_Pattern.Commands.NoCommand;

/**
 * Created by Jordan on 7/12/2016.
 */
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7]; // hard-coded values
        offCommands = new Command[7];

        Command noCommand = new NoCommand(); // null value to initialize
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot]; // keep track of the last command to undo
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot]; // keep track of the last command to undo
    }

    public void undoButtonWasPushed() {
        undoCommand.undo(); // reverses operation of last command
    }

    public String toString() {
        // toString code here...
        return "To String";
    }



}
