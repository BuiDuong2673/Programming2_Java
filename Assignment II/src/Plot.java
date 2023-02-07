
public class Plot {

	private Building building;
	private String name = null;
	private String location = null;
	private double area = 0.0;
	
	public Plot(Building buildings, String plotName, String plotLocation, double plotArea) {
		setBuilding(buildings);
		setName(plotName);
		setLocation(plotLocation);
		setArea(plotArea);
	}
	
	public Building getBuilding() {
		return building;
	}
	
	public void setBuilding(Building building) {
		this.building = building;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		}
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		if (location != null && location.length() > 0) {
			this.location = location;
		}
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		if (area > 0.0) {
			this.area = area;
		}
	}
	
	public void printPlot() {
		System.out.println("Plot name: " + name + "\nLocation: " + location + "\nArea: " + area);
		building.printBuilding();
	}

}
