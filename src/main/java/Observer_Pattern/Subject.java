package Observer_Pattern;


/**
 * Created by Jordan on 8/3/2016.
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}
