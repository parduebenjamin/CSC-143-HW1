//itinerary.enterTrip(new Vacation("Vancouver", 4, 399, 300));
public class Vacation extends LeisureTrip{
	
	int totalCost = 0;
	int foodLodging = 0;
	int outOfPocket = 0;
	int travelCosts = 0;
	int activityCosts = 0;
	
	public Vacation(String city, int totalTravelCost, int totalFoodLodgingCost, int activityCost) {
		super(city, totalFoodLodgingCost, totalTravelCost);
		tripType = "Vacation";
		destination = city;
		activityCosts = activityCost;
		foodLodging = totalFoodLodgingCost;
		travelCosts = totalTravelCost;
		outOfPocket = foodLodging + travelCosts + activityCosts;
		totalCost = foodLodging + travelCosts+ activityCosts;
	}
	
	public int getCost(){
		super.getCost();
		return totalCost;
	}
	public int getOutOfPocket() {
		super.getOutOfPocket();
		return outOfPocket;
	}
	
}
