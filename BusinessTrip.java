
public class BusinessTrip extends Trip{

	int totalCost = 0;
	int tripLength = 0;
	int travelReimbursement = 0;
	int dailyExpenseReimbursement = 0;
	int dailyCost = 0;
	int outOfPocket = 0;
	int travelCosts = 0;
	
	//itinerary.enterTrip(new BusinessTrip("Paris", 3, 399, 1000));
	 
	public BusinessTrip(String city, int numberOfDays, int travelCost, int foodLodgingCost) {
		tripType = "Business Trip";
		destination = city;
		tripLength = numberOfDays;
		totalCost = travelCost + foodLodgingCost;
		dailyCost = foodLodgingCost;
		travelCosts = travelCost;
		if (dailyCost > TravelRecord.MAX_DAILY_FOOD_LODGING) {
			dailyExpenseReimbursement = tripLength*TravelRecord.MAX_DAILY_FOOD_LODGING;
		} else {
				dailyExpenseReimbursement = dailyCost * tripLength;
				}
		if (travelCosts > TravelRecord.MAX_TRAVEL) {
			travelReimbursement = TravelRecord.MAX_TRAVEL;
		}else {
			travelReimbursement = travelCosts;
			}
		outOfPocket = totalCost - (dailyExpenseReimbursement + travelReimbursement);
		if (outOfPocket < 0)
			{ outOfPocket = 0;}
	}
	
	public int getCost(){
		return totalCost;
	}
	public int getOutOfPocket() {
		return outOfPocket;
	}
	
	
	//public final static int MAX_TRAVEL = 3000;
	//public final static int MAX_DAILY_FOOD_LODGING = 400;

	}



	

/*
 * 	System.out.println("Destincation is "+destination+". The trip will last "+tripLength+" days.");
System.out.println("The cost of food will be " + foodCost + ". The cost of lodging will be " + lodgingCost+ ". ");
System.out.println("The total cost will be " + totalCost+".");
*/
//super.print();