import java.util.*;

public class Itinerary {
// provide methods to:
	//enter trip into travel record
	//clear travel record
	//get total quantity of trips
	//get sum of getCost() of trips
	//get sum of outOfPocket of trps
	//get a string representing a record for the tips
	
	//int totalOutOfPocket = 0;
	//int numberOfTrips = 0;
	
	//public static void main(String[] arg) {	}
	
	public Vector <Trip> itinerary = new Vector <Trip>();

	public void enterTrip(Trip trip) {
		itinerary.add(trip);
	}
	
	public void clear() {
		itinerary.removeAllElements();
		System.out.println();
		System.out.println("Old itinerary cleared.");
	}
	public void print() {
		System.out.println(itinerary);
	}
	
public void printDestination() {
	//String tmpString = "";
	int i;
	
	for (Trip c: itinerary) {
		//tmpString = c.getDestination();
		int money = c.getOutOfPocket();
		System.out.println(c.getDestination() + " - " + c.getTripType() + " - cost: " + money);
	}

}
		
	 public int totalOutOfPocket() {
		 int sum = 0;
		  for (Trip c: itinerary) {
		  c.getOutOfPocket();
		 sum = sum + c.getOutOfPocket();
		  }
		  return sum;
		}
	public int numberOfTrips() {
		return itinerary.size();}

}
