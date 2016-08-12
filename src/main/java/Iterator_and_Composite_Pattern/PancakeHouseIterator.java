package Iterator_and_Composite_Pattern;

import java.util.ArrayList;

/**
 * Created by jordan on 8/8/16.
 */
public class PancakeHouseIterator implements Iterator {
    private ArrayList<MenuItem> items;
    private int position = 0;


    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (items.get(position) == null || position >= items.size() - 1) {
            return false;
        } else {
            return true;
        }
    }
}
