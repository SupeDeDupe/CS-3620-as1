
/**
 * @author Sarah Thompson
 * @version Feb 4, 2018
 */
public class DigitalCircuit
{
    public static void main (String args[])
    {
        // tests a sample circuit
        CircuitInput i1 = new CircuitInput(false); 
        CircuitInput i2 = new CircuitInput(true); 
        Gate gate1 = new NotGate(i1);
        Gate gate2 = new AndGate(gate1, i2);
        Probe o1 = new Probe(gate2);
        
        o1.show();
        i1.setValue(true);
        o1.show();
    }
}
