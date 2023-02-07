public class Plot {

    private Building building;
    private String name = null;
    private String address = null;
    private double area = 0.0;

   public Plot(Building building, String name, String address, double area) {
        setBuilding(building);
        setName(name);
        setAddress(address);
        setArea(area);
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        if (address != null && address.length() > 0) {
            this.address = address;
        }
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        if (area > 0) {
            this.area = area;
        }
    }
    
    public String printPlot() {
        return "Plot:\nName: " + name + "\nAddress: " + address 
        + "\nArea: " + area + "\n\n" + building.printInfo();
    }
}