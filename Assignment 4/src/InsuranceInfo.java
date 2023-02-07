public class InsuranceInfo {
    private Property property;
    private double value = 0.0;

    public InsuranceInfo(Property aProperty, double aValue) {
        setProperty(aProperty);
        setValue(aValue);
    }

    public Property getProperty() {
        return property;
    }
    public void setProperty(Property property) {
        this.property = property;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        if (value > 0.0) {
            this.value = value;
        }
    }

    public void printInfo() {
        System.out.println("Property: ");
        property.printProperty();
        System.out.println("Value: " + value);
    }
}
