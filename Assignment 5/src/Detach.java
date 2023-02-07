import java.util.ArrayList;

public class Detach extends Building {

    private double dwellingArea = 0.0;
    private int roomNumber = 0;
    private ArrayList <Resident> residents;
    private ArrayList <Detach> detachs;

    //Constructor for list of detach houses
    public Detach(int dwellingNumber, ArrayList<Detach> detachs) {
        super(dwellingNumber);
        this.detachs = detachs;
    }
    //Constructor for a detach house
    public Detach(int dwellingNumber, double dArea, int roomNum, ArrayList<Resident> residents) {
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
        this.dwellingArea = dwellingArea;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    //return list of residents
    public String printResidents() {
        String residentList = "Residents:\n";
        for (Resident resident : residents) {
            residentList += resident.printResident() + "\n";
        }
        return residentList;
    }
    //return a detach house
    public String printDetach() {
        return "Detach area: " + dwellingArea + "\nNumber of rooms: " + roomNumber 
        + "\n" + printResidents();
    }
    //return list of detach houses
    public String printDetachs() {
        String detachList = "";
        for (Detach detach : detachs) {
            detachList += detach.printDetach() + "\n";
        }
        return detachList;
    }

    @Override
    public String printInfo() {
        return "Detach houses:\n" + super.printInfo() + "\n" + printDetachs();
    }
}
