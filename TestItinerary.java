// Itinerary.java - main method to test Itinerary class
//                         and Trip hierarchy
// Emilia Gan, June 24, 2018

//Student: Benjamin Pardue
//Homework 1
//CSC 143 | Summer 2018
// 07/20/2018

public class TestItinerary {
	public static void main(String[] args) {
		Itinerary itinerary = new Itinerary();
		itinerary.enterTrip(new BusinessTrip("Paris", 3, 399, 1000));
		itinerary.enterTrip(new LeisureTrip("New York City", 105, 500));
		itinerary.enterTrip(new Vacation("Las Vegas", 145, 50, 200));
		itinerary.enterTrip(new Vacation("Miami", 4, 399, 200));
		itinerary.enterTrip(new FamilyReunion(105));
		itinerary.enterTrip(new RecruitingTrip("Seattle", 4, 399, 0, 2));
		itinerary.enterTrip(new Vacation("Amsterdam", 145, 50, 100));
		itinerary.enterTrip(new Vacation("Vancouver", 4, 399, 300));
		itinerary.enterTrip(new RecruitingTrip("Strasbourg", 2, 250, 100, 3));
		itinerary.enterTrip(new AnniversaryTrip("Copenhagen", 5, 50, 1000, 500));
		itinerary.enterTrip(new Vacation("Victoria", 1, 199, 100));
		itinerary.enterTrip(new Vacation("Blue", 1, 199, 100));
		itinerary.enterTrip(new Vacation("Gotham", 1, 199, 100));
		itinerary.enterTrip(new Vacation("Metropolos", 2, 200, 18));
		itinerary.enterTrip(new Vacation("Las Vegas", 145, 50, 200));
		itinerary.enterTrip(new Vacation("Miami", 4, 399, 200));
		itinerary.enterTrip(new FamilyReunion(105));
		itinerary.enterTrip(new RecruitingTrip("Seattle", 4, 399, 0, 2));
		itinerary.enterTrip(new Vacation("Amsterdam", 145, 50, 100));
		itinerary.enterTrip(new Vacation("Vancouver", 4, 399, 300));
		itinerary.enterTrip(new RecruitingTrip("Strasbourg", 2, 250, 100, 3));
		itinerary.enterTrip(new AnniversaryTrip("Copenhagen", 5, 50, 1000, 500));
		itinerary.enterTrip(new Vacation("Victoria", 1, 199, 100));
		
		//System.out.println("Total out-of-pocket cost: $" +itinerary.totalOutOfPocket());
		System.out.println("Number of trips: " + itinerary.numberOfTrips());
		if (itinerary.totalOutOfPocket() > 0) {
				System.out.println(
				"Total out-of-pocket cost: " + TravelRecord.dollars_int_to_string(itinerary.totalOutOfPocket()));}
			else {
				System.out.println("Total out-of-pocket cost: $0");
			}
		System.out.println();
		System.out.println("Itinerary for: " + TravelRecord.USER_NAME);
		System.out.println();
		itinerary.printDestination();
		
		itinerary.clear();
		
		 itinerary.enterTrip(new LeisureTrip("New York City", 105, 500));
		itinerary.enterTrip(new Vacation("Las Vegas", 145, 50, 200));
		itinerary.enterTrip(new Vacation("Miami", 4, 399, 200));
		itinerary.enterTrip(new FamilyReunion(105));
		itinerary.enterTrip(new RecruitingTrip("Seattle", 4, 399, 0, 2));
		itinerary.enterTrip(new Vacation("Amsterdam", 145, 50, 100));
		itinerary.enterTrip(new Vacation("Vancouver", 4, 399, 300));
		itinerary.enterTrip(new RecruitingTrip("Strasbourg", 2, 250, 100, 3));
		itinerary.enterTrip(new AnniversaryTrip("Copenhagen", 5, 50, 1000, 500));
		itinerary.enterTrip(new Vacation("Victoria", 1, 199, 100));
		
		System.out.println();
		System.out.println();
		System.out.println("Number of trips: " + itinerary.numberOfTrips());
		if (itinerary.totalOutOfPocket() > 0) {
				System.out.println(
				"Total out-of-pocket cost: " + TravelRecord.dollars_int_to_string(itinerary.totalOutOfPocket()));}
			else {
				System.out.println("Total out-of-pocket cost: $0");
			}
		System.out.println();
		System.out.println("Itinerary for: " + TravelRecord.USER_NAME);
		System.out.println();
		itinerary.printDestination();
		

		//System.out.println(itinerary);
		itinerary.clear();
		/*
		 * 		itinerary.enterTrip(new Vacation("Reykjavik", 145, 20, 500));
		itinerary.enterTrip(new BusinessTrip("Glasgow", 105, 50, 0));
		itinerary.enterTrip(new FamilyReunion(89));
		itinerary.enterTrip(new RecruitingTrip("Cambridge", 4, 399, 0, 3));
		itinerary.enterTrip(new AnniversaryTrip("Dublin", 3, 109, 300, 500));
		System.out.println("Number of trips: " + itinerary.numberOfTrips());
		System.out.println(
				"Total out-of-pocket cost: " + TravelRecord.dollars_int_to_string(itinerary.totalOutOfPocket()));
		 */

		//System.out.println(itinerary);
	}
}
