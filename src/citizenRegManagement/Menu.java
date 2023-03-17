
package citizenRegManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    //method adding new citizen into the registry
    public static void addNewCitizen(Scanner input, Registry registry) {
        System.out.println("ID number : ");
        String idNumber = input.next();
        System.out.println("First Name : ");
        String fName = input.next();
        System.out.println("Last Name : ");
        String lName = input.next();
        System.out.println("Age : ");
        String age = input.next();
        System.out.println("Date of Birth : ");
        String dateOfBirth = input.next();
        System.out.println("AFM : ");
        String afm = input.next();
        System.out.println("Address : ");
        String address = input.next();

        Citizen citizen = new Citizen(idNumber, fName, lName, age, dateOfBirth, afm, address);

        //adding the Citizen, if id number exist return a message
        boolean result = registry.addCitizen(citizen);
        if (result) {
            System.out.println(citizen + " added successfully!");
        } else
            System.out.println("Probably citizens ID number : " + citizen.getAt() + " already in Registry.");

    }

    public static void delCitizen(Scanner input, Registry registry) {
        System.out.println("Citizens ID Number : ");
        String idNumber = input.next();
        //delete the citizen, if id number not exist return a message
        boolean result = registry.deleteCitizen(idNumber);
        if (result) {
            System.out.println("deleted successfully!");
        } else
            System.out.println("There is no citizen with ID Number : " + idNumber + ", in Registry.");
    }

    public static void updateCitizen(Scanner input, Registry registry) {
        System.out.println("Give me Citizens id Number :");
        String idNumber = input.next();

        System.out.println();
        int choice = 0;
        String update;

        Scanner inputChoice = new Scanner(System.in);
        Scanner inputUpdate = new Scanner(System.in);
        do {
            System.out.println("1) Update the AFM ");
            System.out.println("2) Update the Address ");
            System.out.println("3) Escape!");
            try {
                choice = inputChoice.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Did not give an integer!");
                break;
            }
            if (choice == 1) {
                System.out.println("Give the new AFM :");
                update = inputUpdate.next();
                registry.updateCit(idNumber, 1, update);
            } else if (choice == 2) {
                System.out.println("Give the new Address : ");
                update = inputUpdate.next();
                registry.updateCit(idNumber, 2, update);
            }
            System.out.println();

        } while (choice != 3);

        input.close();

    }

    public static void printRegistry(Registry registry) {
        registry.toString();
    }


}
