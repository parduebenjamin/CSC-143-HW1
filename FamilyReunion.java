
public class FamilyReunion extends LeisureTrip{

		//itinerary.enterTrip(new LeisureTrip("New York City", 105, 500));
		int totalCost = 0;
		int outOfPocket = 0;
		int travelCosts = 0;
		
		public FamilyReunion(int totalTravelCost) {
			super(TravelRecord.USER_FAM_REUNION_DEST, 0, totalTravelCost);
			tripType = "Family Reunion";
			travelCosts = totalTravelCost;
			outOfPocket = travelCosts;
			totalCost = travelCosts;
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
