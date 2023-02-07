public class Building {
    
    private int dwellingNumber = 0;

    public Building(int dwellingNumber) {
        setDwellingNumber(dwellingNumber);
    }

    public int getDwellingNumber() {
        return dwellingNumber;
    }

    public void setDwellingNumber(int dwellingNumber) {
        if (dwellingNumber > 0) {
            this.dwellingNumber = dwellingNumber;
        }
    }

    public String printInfo() {
        return "Number of dwellings: " + dwellingNumber + "\n";
    }
    
}
