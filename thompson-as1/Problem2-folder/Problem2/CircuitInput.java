import java.util.*;
/**
 * @author Sarah Thompson
 * @version Feb 4, 2018
 */
public class CircuitInput extends Gate 
{
    
    public CircuitInput(boolean initstate) 
    {
        this.state = initstate;
        //System.out.println("Input State: "+state);
        observers = new ArrayList<Observer>();
    }
    
    public void setValue(boolean newstate)
    {
        this.state = newstate;
        //System.out.println("Input State: "+state);
        notifyObservers();
    }
}
