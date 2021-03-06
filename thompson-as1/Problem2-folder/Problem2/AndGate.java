import java.util.*;
/**
 * @author Sarah Thompson
 * @version Feb 4, 2018
 */
public class AndGate extends Gate implements Observer
{
    private Gate input1, input2;
    
    public AndGate(Gate inp1, Gate inp2) 
    { 
        input1 = inp1;
        input2 = inp2;
        observers = new ArrayList<Observer>();
        
        if (input1.getState() && input2.getState())
            this.state = true;
        else
            this.state = false;
            
        //System.out.println("And State: "+state);
        input1.registerObserver(this);
        input2.registerObserver(this);
    }
    
    public void update() {
		if (input1.getState() && input2.getState())
            this.state = true;
        else
            this.state = false;
        
        //System.out.println("And State: "+state);
        setChanged();
	}
	
}
