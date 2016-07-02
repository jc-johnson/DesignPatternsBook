package Decorator_Pattern;

/**
 * Created by Jordan on 6/29/2016.
 */
public abstract class Bad_Beverage {

    String description;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public String getDescription(){ return this.description; }

    /**
     * Superclass cost() will calculate the costs for all
     * of the condiments, while the overriden cost() in the
     * subclasses will extend that functionality to include
     * costs for that specific beverage type.
     *
     * Each cost method needs to compute the cost of the beverage
     * and then add in the condiments by calling the superclass
     * implementation of cost()
     * @return
     */
    public int cost(){
        int ans = 0;
        if (milk){
            ans = ans + 1;
        }
        if (soy){
            ans = ans + 2;
        }
        if (mocha){
            ans = ans + 3;
        }
        if(whip){
            ans = ans + 4;
        }
        return ans;
    }

    public abstract void hasMilk();
    public abstract void setMilk();
    public abstract void hasSoy();
    public abstract void setSoy();
    public abstract void hasMocha();
    public abstract void setMocha();
    public abstract void hasWhip();
    public abstract void setWhip();

    // other methods
}
