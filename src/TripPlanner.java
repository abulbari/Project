import java.util.Scanner;

public class TripPlanner {

	private static Scanner travel;
	private static Scanner in;

	public static void main(String[] args)
	
	{

		Greeting();

		Travel_time_and_budget();

	}

	public static void Greeting() {

		System.out.println("Welcome to Vaccation Planner");

		System.out.println("what is your name ? ");

		in = new Scanner(System.in);

		String Customer_Name = in.next();

		System.out.println("Nice to meet you " + Customer_Name
				+ " ,whereare you travelling to ?");

		String City_Name = in.next();

		System.out.println(City_Name + "!sounds like a great trip");

		System.out.println("********");
	}

	public static void Travel_time_and_budget()

	{

		System.out.println("Travel_time_and_budget");

		System.out
				.println("How many days are you going to spend on Travelling ? ");

		travel = new Scanner(System.in);

		int traveldays = travel.nextInt();

		System.out
				.println("How much money in USD are you planning to spend on your trip ? ");

		int money = travel.nextInt();

		System.out.println("So you going to Travel for " + traveldays
				+ " days and you want to spend " + money + " USD, nice :)");

		System.out
				.println("what is the three letter currency symbol for your travel destination ?");

		String currency_symbol = travel.next();

		System.out
				.println("The three letter currency symbol for your travel destination is"
						+ currency_symbol);

	}
}
