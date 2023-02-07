import java.util.ArrayList;

public class Apartment extends Building {


    private double dwellingArea = 0.0;
    private int roomNumber = 0;
    private ArrayList<Resident> residents;
    private ArrayList<Apartment> apartments;

    //Constructor for list of apartments
    public Apartment(int dwellingNumber, ArrayList<Apartment> apartments) {
        super(dwellingNumber);
        this.apartments = apartments;
    }

    //Constructor for apartment
    public Apartment(int dwellingNumber, double dArea, int roomNum, ArrayList<Resident> residents) {
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
        if (dwellingArea > 0.0) {
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
        String residentList = "Residents:\n";
        for (Resident resident : residents) {
            residentList += resident.printResident() + "\n";
        }
        return residentList;
    }
    //return an apartment
    public String printApartment() {
        return "Apartment area: " + dwellingArea + "\nNumber of rooms: " + roomNumber 
        + "\n" + printResidents();
    }
    //return list of apartments
    public String printApartments() {
        String apartmentList = "";
        for (Apartment apartment : apartments) {
            apartmentList += apartment.printApartment() + "\n";
        }
        return apartmentList;
    }
    
    @Override 
    public String printInfo() {
        return "Apartments:\n" + super.printInfo() + "\n" + printApartments();
    }
}