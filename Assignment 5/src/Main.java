import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Hello!");
        //Read Plot information
        System.out.println("Plot information:\n");
        System.out.println("Enter the plot name (String): ");
        String plotName = scanner.nextLine();

        System.out.println("Enter the plot address (String): ");
        String plotAddress = scanner.nextLine();

        System.out.println("Enter the plot area (double): ");
        double plotArea = readDouble();

        //Read Building information 
        System.out.println("Enter the number of dwellings (int): ");
        int dwellingNumber = readInt();

        //Choose the building type
        System.out.println("Choose the building type: ");
        System.out.println("a) Apartment");
        System.out.println("t) Terrace");
        System.out.println("d) Detach");
        System.out.println("Other) Quit");
        System.out.println("Enter your choice: ");
        String choice = scanner.nextLine();

        if (choice.equals("a")) {
            ArrayList <Apartment> apartments = new ArrayList<>();
            System.out.println("Apartments information:\n");
            for (int i = 0; i < dwellingNumber; i++) {
                System.out.println("Enter the apartment's area: ");
                double dwellingArea = readDouble();

                System.out.println("Enter the number of rooms: ");
                int roomNumber = readInt();

                ArrayList <Resident> residents = new ArrayList<>();
                System.out.println("Residents information:\n");
                for (int a = 0; a < roomNumber; a++) {
                    System.out.println("Enter resident's name: ");
                    String residentName = scanner.nextLine();
                    Resident resident = new Resident(residentName);
                    residents.add(resident);
                }
                Apartment apartment = new Apartment(dwellingNumber, dwellingArea, roomNumber, residents);
                apartments.add(apartment);
            }
            Building building = new Apartment(dwellingNumber, apartments); 
            Plot plot = new Plot(building, plotName, plotAddress, plotArea);
            System.out.println(plot.printPlot());
        }
        else if (choice.equals("t")) {
            ArrayList <Terrace> terraces = new ArrayList<>();
            System.out.println("Terraces information:\n");
            for (int i = 0; i < dwellingNumber; i++) {
                System.out.println("Enter the terrace's area: ");
                double dwellingArea = readDouble();

                System.out.println("Enter the number of rooms: ");
                int roomNumber = readInt();

                ArrayList <Resident> residents = new ArrayList<>();
                System.out.println("Residents information:\n");
                for (int a = 0; a < roomNumber; a++) {
                    System.out.println("Enter resident's name: ");
                    String residentName = scanner.nextLine();
                    Resident resident = new Resident(residentName);
                    residents.add(resident);
                }
                Terrace terrace = new Terrace(dwellingNumber, dwellingArea, roomNumber, residents);
                terraces.add(terrace);
            }
            Building building = new Terrace(dwellingNumber, terraces);
            Plot plot = new Plot(building, plotName, plotAddress, plotArea);
            System.out.println(plot.printPlot());
        }
        else if (choice.equals("d")) {
            ArrayList <Detach> detachs = new ArrayList<>();
            System.out.println("Detachs information:\n");
            for (int i = 0; i < dwellingNumber; i++) {
                System.out.println("Enter the apartment's area: ");
                double dwellingArea = readDouble();

                System.out.println("Enter the number of rooms: ");
                int roomNumber = readInt();

                ArrayList <Resident> residents = new ArrayList<>();
                System.out.println("Residents information:\n");
                for (int a = 0; a < roomNumber; a++) {
                    System.out.println("Enter resident's name: ");
                    String residentName = scanner.nextLine();
                    Resident resident = new Resident(residentName);
                    residents.add(resident);
                }
                Detach detach = new Detach(dwellingNumber, dwellingArea,roomNumber, residents);
                detachs.add(detach);
            }
            Building building = new Detach(dwellingNumber, detachs);
            Plot plot = new Plot(building, plotName, plotAddress, plotArea);
            System.out.println(plot.printPlot());
        }
        else {
            System.out.println("Thank you for visit!");
        }
    }

    //Read positive integer
    public static int readInt() {
        boolean ok = false;
        int value = 0;

        do {
            try{
                value = scanner.nextInt();
                scanner.nextLine();
                if(value > 0) {
                    ok = true;
                    break;
                } else {
                    System.out.println("Negative value error, please try again > ");

                }
            } catch (InputMismatchException ime) {
                scanner.nextLine();
                System.out.println("Error, please try again > ");
            }
        } while (!ok);
        return value;
    }

    //Read positive double
    public static double readDouble() {
        boolean ok = false;
        double value = 0.0;

        do {
            try {
                value = scanner.nextDouble();
                scanner.nextLine();
                if (value > 0.0) {
                    ok = true;
                    break;
                } else {
                    System.out.println("Negative value error, please try again > ");
                }
            } catch (InputMismatchException ime) {
                scanner.nextLine();
                System.out.println("Error, please try again > ");
            } 
        }while (!ok);
        return value;
    }
}
