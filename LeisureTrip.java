public class LeisureTrip extends Trip{
	//itinerary.enterTrip(new LeisureTrip("New York City", 105, 500));
	int totalCost = 0;
	int foodLodging = 0;
	int outOfPocket = 0;
	int travelCosts = 0;
	
	
	public LeisureTrip(String city, int totalFoodLodgingCost, int totalTravelCost) {
		tripType = "Leisure Trip";
		destination = city;
		foodLodging = totalFoodLodgingCost;
		travelCosts = totalTravelCost;
		outOfPocket = foodLodging + travelCosts;
		totalCost = foodLodging + travelCosts;
	}
	
	public int getCost(){
		return totalCost;
	}
	public int getOutOfPocket() {
		return outOfPocket;
	}
	
}