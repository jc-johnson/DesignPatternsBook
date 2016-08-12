package Iterator_and_Composite_Pattern;

/**
 * Created by jordan on 8/8/16.
 */
public interface Iterator<MenuItems> {

    boolean hasNext();
    Object next();
    void remove();
}
