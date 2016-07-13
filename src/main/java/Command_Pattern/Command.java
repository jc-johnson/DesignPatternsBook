package Command_Pattern;

/**
 * Created by Jordan on 7/6/2016.
 */
public interface Command {

    public void execute(); // only needed method

    public void undo();
}
