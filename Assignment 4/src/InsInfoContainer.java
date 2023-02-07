import java.util.ArrayList;
import java.util.List;

public class InsInfoContainer {

    private List <InsuranceInfo> insurances;

    public InsInfoContainer() {
        insurances = new ArrayList <> ();
    }    

    public InsInfoContainer(List<InsuranceInfo> aInsurances) {
        setInsurances(aInsurances);
    }

    public List<InsuranceInfo> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<InsuranceInfo> insurances) {
        this.insurances = insurances;
    }

    public void insertInfo (InsuranceInfo insurance) {
        insurances.add(insurance);
    }

    public void printAll() {
        for (InsuranceInfo insurance : insurances) {
            System.out.println("Insurance: ");
            insurance.printInfo();
        }
    }

    public void printMore(double lowBound) {
        System.out.println("Low boundary value: " + lowBound);
        System.out.println("The insurances which value greater than low boundary are: ");
        for (InsuranceInfo insurance : insurances) {
            if (insurance.getValue() > lowBound) {
                System.out.println("Insurance: ");
                insurance.printInfo();
            }
        }
    }

    public void printLess(double upBound) {
        System.out.println("Up boundary value " + upBound);
        System.out.println("The insurances which have value less than up boundary are: ");
        for (InsuranceInfo insurance : insurances) {
            if (insurance.getValue() < upBound) {
                System.out.println("Insurance: ");
                insurance.printInfo();
            }
        }
    }
}
