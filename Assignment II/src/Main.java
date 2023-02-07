import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String [] args) {
		System.out.println("Tervetuloa!");
		
		System.out.println("Enter plot name (String): ");
		String plotName = scanner.nextLine();
		
		System.out.println("Enter plot location (String): ");
		String plotLocation = scanner.nextLine();
		
		System.out.println("Enter plot area (double): ");
		double plotArea = scanner.nextDouble();
		scanner.nextLine();
			
		System.out.println("Enter building area (double): ");
		double buildingArea = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Enter number of rooms (integer): ");
		int rooms = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter number of occupants (integer): ");
		int occupants = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter resident name (String): ");
		String residentName = scanner.nextLine();
		
		System.out.println("Enter resident birth date (String): ");
		String birthDate = scanner.nextLine();
		
		Resident [] residents = new Resident[1];
		residents[0] = new Resident(residentName, birthDate);
		Building building = new Building(residents, buildingArea, rooms, occupants);
		Plot plot = new Plot(building, plotName, plotLocation, plotArea);
		plot.printPlot();
		
		
	}
}
