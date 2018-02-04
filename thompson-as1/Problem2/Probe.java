/**
 * @author Sarah Thompson
 * @version Feb 4, 2018
 */
public class Probe
{
    private Gate input;
    private boolean state; 
    public Probe(Gate inp) 
    {
        
    } 
    
    public void show()
    {
        System.out.println(state ? "1" : "0"); 
    }
}
