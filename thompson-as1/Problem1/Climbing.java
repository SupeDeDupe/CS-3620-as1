
/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class Climbing extends AddonDecorator
{
    Room room;

	public Climbing(Room room) {
		this.room = room;
	}

	public String getDescription() {
		return room.getDescription() + ", Climbing";
	}

	public double cost() {
		return 60 + room.cost();
	}
}
