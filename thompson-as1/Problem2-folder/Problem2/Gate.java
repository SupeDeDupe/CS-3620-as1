import java.util.*;
/**
 * @author Sarah Thompson
 * @version Feb 4, 2018
 */
public class Gate implements Subject
{
    protected boolean state;
    protected ArrayList<Observer> observers;
    
    public boolean getState() 
    {
        return state;
    }
    
    public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
	    for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public void setChanged(){
	    notifyObservers();
	}
}
