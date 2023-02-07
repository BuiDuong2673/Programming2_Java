public class Property {
    private String type = null;
    private String location = null;

    public Property (String aType, String aLocation) {
        setType(aType);
        setLocation(aLocation);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null && type.length() > 0) {
            this.type = type;
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

    public void printProperty () {
        System.out.println("Type: " + type + " Location: " + location);
    }
}
