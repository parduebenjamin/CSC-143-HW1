//itinerary.enterTrip(new AnniversaryTrip("Copenhagen", 5, 50, 1000, 500));
//itinerary.enterTrip(new Vacation("Vancouver", 4, 399, 300));
public class AnniversaryTrip extends LeisureTrip {

	int totalCost = 0;
	int foodLodging = 0;
	int outOfPocket = 0;
	int travelCosts = 0;
	int activityCosts = 0;
	int upgradeCosts = 0;
	
	public AnniversaryTrip(String city, int totalTravelCost, int totalFoodLodgingCost, int activityCost, int upgradeCost) {
		super(city, totalFoodLodgingCost, totalTravelCost);
		destination = city;
		upgradeCosts = upgradeCost;
		activityCosts = activityCost;
		foodLodging = totalFoodLodgingCost;
		travelCosts = totalTravelCost;
		outOfPocket = foodLodging + travelCosts + activityCosts + upgradeCosts;
		totalCost = foodLodging + travelCosts+ activityCosts + upgradeCosts;
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
