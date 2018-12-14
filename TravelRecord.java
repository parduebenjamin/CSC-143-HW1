// TravelRecord.java - constants and method to format cents as dollars and cents
// Emilia Gan, June 24, 2018
public class TravelRecord {
public final static int MAX_TRAVEL = 3000;
public final static int MAX_DAILY_FOOD_LODGING = 400;
public final static String USER_NAME = "Benjamin Pardue";
public final static int MAX_ITEM_DEST_SIZE = 25;
public final static String USER_FAM_REUNION_DEST = "Boston";
public static String dollars_int_to_string(int dollars) {
String s = "$";
if (dollars < 0) {
s += "-";
dollars *= -1;
}
if (dollars > 0)
s += dollars;
return s;
}
}
