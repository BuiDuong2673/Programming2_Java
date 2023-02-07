public class Resident {

    private String name = null;

    public Resident(String aName) {
        setName(aName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        }
    }

    public String printResident() {
        return "Resident's name: " + name;
    }
}