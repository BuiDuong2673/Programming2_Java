import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello!");

        System.out.println("Enter property's type: ");
        String type = scanner.nextLine();
        
        System.out.println("Enter property's location: ");
        String location = scanner.nextLine();

        Property property = new Property(type, location);

        InsuranceInfo info1 = new InsuranceInfo(property, 345);
        InsuranceInfo info2 = new InsuranceInfo(property, 543);
        InsuranceInfo info3 = new InsuranceInfo(property, 256);
        InsuranceInfo info4 = new InsuranceInfo(property, 625);
        InsuranceInfo info5 = new InsuranceInfo(property, 123);

        InsInfoContainer insurances = new InsInfoContainer();

        insurances.insertInfo(info1);
        insurances.insertInfo(info2);
        insurances.insertInfo(info3);
        insurances.insertInfo(info4);
        insurances.insertInfo(info5);

        insurances.printAll();

        System.out.println("Enter the low boundary: ");
        double lowBound = scanner.nextDouble();
        scanner.nextLine();
        insurances.printMore(lowBound);

        System.out.println("Enter the up boundary: ");
        double upBound = scanner.nextDouble();
        scanner.nextLine();
        insurances.printLess(upBound);

    }
}
