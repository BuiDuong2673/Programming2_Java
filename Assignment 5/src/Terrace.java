import java.util.ArrayList;

public class Terrace extends Building {
    
    private double dwellingArea = 0.0;
    private int roomNumber = 0;
    private ArrayList <Resident> residents;
    private ArrayList <Terrace> terraces;

    //Constructor for list of terrace houses
    public Terrace(int dwellingNumber, ArrayList<Terrace> terraces) {
        super(dwellingNumber);
        this.terraces = terraces;
    }

    //Constructor for a terrace house
    public Terrace(int dwellingNumber, double dArea, int roomNum, ArrayList<Resident> residents) {
        super(dwellingNumber);
        setDwellingArea(dArea);
        setRoomNumber(roomNum);
        this.residents = residents;
    }

    //Getter and Setter
    public double getDwellingArea() {
        return dwellingArea;
    }
    public void setDwellingArea(double dwellingArea) {
        if (dwellingArea > 0) {
            this.dwellingArea = dwellingArea;
        }
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        if (roomNumber > 0) {
            this.roomNumber = roomNumber;
        }
    }

    //return list of residents
    public String printResidents() {
        String residentList = "Residents: \n";
        for (Resident resident : residents) {
            residentList += resident.printResident() + "\n";
        }
        return residentList;
    }
    //return a terrace house
    public String printTerrace() {
        return "Terrace area: " + dwellingArea + "\nNumber of rooms: " + roomNumber 
        + "\n" + printResidents();
    }
    //return list of terrace houses
    public String printTerraces() {
        String terraceList = "";
        for (Terrace terrace : terraces) {
            terraceList += terrace.printTerrace() + "\n";
        }
        return terraceList;
    }
    
    @Override
    public String printInfo() {
        return "Terrace houses:\n" + super.printInfo() + "\n" + printTerraces();
    }
}
