
public class Building {

	private Resident [] residents;
	private double area = 0.0;
	private int rooms = 0;
	private int occupants = 0;
	
	public Building(Resident [] resident, double buildingArea, int numberRoom, int numberOccupants) {
		setResidents(resident);
		setArea(buildingArea);
		setRooms(numberRoom);
		setOccupants(numberOccupants);
	}
	
	public Resident[] getResidents() {
		return residents;
	}
	
	public void setResidents(Resident[] residents) {
		this.residents = residents;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		if (area > 0.0) {
			this.area = area;
		}
	}
	
	public int getRooms() {
		return rooms;
	}
	
	public void setRooms(int rooms) {
		if (rooms > 0) {
			this.rooms = rooms;
		}
	}
	
	public int getOccupants() {
		return occupants;
	}
	
	public void setOccupants(int occupants) {
		if (occupants > 0) {
			this.occupants = occupants;
		}
	}

	public void printBuilding() {
		System.out.println("Building area: " + area + "\nNumber of rooms: " + rooms 
				+ "\nNumber of occupants: " + occupants);
		for (Resident resident : residents) {
			resident.printResident();
		}		
	}
	
}
