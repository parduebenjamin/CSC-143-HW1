
public class RecruitingTrip extends BusinessTrip{
	//super.BusinessTrip(String destination, int numberOfDays, int travelCost, int foodLodgingCost){};
	int dailyRecruitingReimb = 0;
	int desirable = 1;
	int dailyExpenseReimbursement(){
		dailyRecruitingReimb = TravelRecord.MAX_DAILY_FOOD_LODGING;
		return dailyRecruitingReimb;
	}
	
	public RecruitingTrip(String city, int numberOfDays, int travelCost, int foodLodgingCost, int desirability) {
		super(city, numberOfDays, travelCost, foodLodgingCost);
		tripType = "Recruiting Trip";
		destination = city;
		desirable = desirability;
		tripLength = numberOfDays;
		totalCost = travelCost + foodLodgingCost;
		dailyCost = foodLodgingCost;
		travelCosts = travelCost;
		if (dailyCost > this.dailyRecruitingReimb*desirable) {
			dailyExpenseReimbursement = tripLength*this.dailyRecruitingReimb;
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
		super.getCost();
		return totalCost;
	}
	public int getOutOfPocket() {
		super.getOutOfPocket();
		return outOfPocket;
	}
	
	
}
