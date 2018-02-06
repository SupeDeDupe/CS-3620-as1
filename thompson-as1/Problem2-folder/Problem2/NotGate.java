import java.util.*;
/**
 * @author Sarah Thompson
 * @version Feb 4, 2018
 */
public class NotGate extends Gate implements Observer
{
    private Gate input;
    
    public NotGate(Gate inp) 
    { 
        observers = new ArrayList<Observer>();
        input = inp;
        this.state = !input.getState();
        //System.out.println("Not State: "+state);
        
        input.registerObserver(this);
    }
    
    public void update() {
		this.state = !input.getState();
		//System.out.println("Not State: "+state);
		setChanged();
	}
}
