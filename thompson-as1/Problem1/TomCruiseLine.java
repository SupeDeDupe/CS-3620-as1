import javax.swing.JFrame;
/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class TomCruiseLine
{
    public static void main(String args[]) {
        
        JFrame frame = new JFrame ("Tome Cruise Line");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        TomCruiseLinePanel panel = new TomCruiseLinePanel();
        frame.getContentPane().add (panel);
        frame.pack();
        frame.setVisible(true);
        
		Room room1 = new Interior();
		System.out.println(room1.getDescription() 
				+ " $" + room1.cost());
 
		Room romm2 = new OceanView();
		romm2 = new Helicopter(romm2);
		romm2 = new Helicopter(romm2);
		romm2 = new Lumberjack(romm2);
		System.out.println(romm2.getDescription() 
				+ " $" + romm2.cost());
 
		Room room3 = new Balcony();
		room3 = new Climbing(room3);
		room3 = new Beverage(room3);
		room3 = new Klondike(room3);
		System.out.println(room3.getDescription() 
				+ " $" + room3.cost());
	}
}
