
/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class Klondike extends AddonDecorator
{
    Room room;

	public Klondike(Room room) {
		this.room = room;
	}

	public String getDescription() {
		return room.getDescription() + ", Klondike";
	}

	public double cost() {
		return 50 + room.cost();
	}
}
