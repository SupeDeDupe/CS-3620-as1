
/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class Scientology extends AddonDecorator
{
    Room room;

	public Scientology(Room room) {
		this.room = room;
	}

	public String getDescription() {
		return room.getDescription() + ", Scientology";
	}

	public double cost() {
		return 500 + room.cost();
    }
}
