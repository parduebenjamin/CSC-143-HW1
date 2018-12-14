import java.util.*;

// Trip.java - Trip item abstract superclass
// Emilia Gan June 24, 2018
// Modeled after DesertItem.java = Suzanne Balik, 25 Jun 2002
/**
 * Abstract superclass for Trip Item hierarchy
 * 
 * @author Emilia Gan
 */
public abstract class Trip {
	protected String destination;
	protected String tripType;

	/**
	 * Null constructor for Trip class
	 */
	public Trip() {
		this("");
	}

	/**
	 * Initializes Trip data
	 * 
	 * @param destination
	 *            for Trip
	 */
	public Trip(String destination) {
		if (destination.length() <= TravelRecord.MAX_ITEM_DEST_SIZE)
			this.destination = destination;
		else
			this.destination = destination.substring(0, TravelRecord.MAX_ITEM_DEST_SIZE);
	}

	/**
	 * Returns destination of Trip
	 * 
	 * @return destination of Trip
	 */
	public final String getDestination() {
		return destination;
	}

	/**
	 * Returns cost of Trip
	 * 
	 * @return cost of Trip
	 */
	public abstract int getCost();
	public abstract int getOutOfPocket();
	public final String getTripType() {
		return tripType;
	}
}