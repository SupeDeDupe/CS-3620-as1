/**
 * @author Sarah Thompson
 * @version Feb 4, 2018
 */
public class AndGate extends Gate
{
    private Gate input1, input2;
    public AndGate(Gate inp1, Gate inp2) 
    { 
        input1 = inp1;
        input2 = inp2;
    }
}
