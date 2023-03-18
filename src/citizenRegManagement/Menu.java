
package citizenRegManagement;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    //method adding new citizen into the registry
    public static void addNewCitizen(Scanner input, Registry registry) {
        //id Number
        System.out.println("ID number : ");
        String idNumber = input.next();
        while (idNumber.length() != 8) {
            System.out.println("ID number must be exactly 8 characters long. Please enter a valid ID number: ");
            idNumber = input.next();
        }

        //First Name
        System.out.println("First Name : ");
        String fName = input.next();

        //Last Name
        System.out.println("Last Name : ");
        String lName = input.next();

        //Sex

        String sex = null;
        do {
            System.out.println("Sex (press m for male/ f for female): ");
            sex = input.next();
        } while (!sex.equalsIgnoreCase("m") && !sex.equalsIgnoreCase("f"));

        //Date of Birth
        String dateOfBirth;
        do {
            System.out.println("Date of Birth (in the format of DD-MM-YYYY): ");
            dateOfBirth = input.next();
        } while (!dateOfBirth.matches("^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[0-2])-\\d{4}$"));

        //AFM
        System.out.println("AFM (optional 0 for null): ");
        String afm = input.next();
        if (afm.equals("0")) {
            afm = null; // Set AFM to null if the user did not provide input
        }

        //Address
        System.out.println("Address (optional 0 for null): ");
        String address = input.next();
        if (address.equals("0")) {
            address = null; // Set Address to null if the user did not provide input
        }

        Citizen citizen = new Citizen(idNumber, fName, lName, sex, dateOfBirth, afm, address);

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

        System.out.println("1) Update the AFM ");
        System.out.println("2) Update the Address ");
        try {
            choice = inputChoice.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Did not give an integer!");

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


    }


}
