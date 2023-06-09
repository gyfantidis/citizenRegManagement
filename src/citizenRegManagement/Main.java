package citizenRegManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

import static citizenRegManagement.Menu.*;
import static citizenRegManagement.readAndWriteFile.*;


public class Main {
    public static void main(String[] args) {

        //Checking if library state exists so as to be loaded
        String filename = "RegistryFile.dat";
        Registry registry = readRegistryFromFile(filename);
        if (registry == null) {
            registry = new Registry("Citizens Registry");
        }


        //Menu

        int choice = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\n----MENU for Registry Management----");
            System.out.println();
            System.out.println("1) Add new Citizen into the Registry");
            System.out.println("2) Delete Citizen from the Registry");
            System.out.println("3) Update Citizens AFM or Address");
            System.out.println("4) Search Citizen into the Registry");
            System.out.println("5) Print the Registry");
            System.out.println("6) Save and Exit!");
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Did not give an integer!");
                break;
            }
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Adding... : ");
                    addNewCitizen(input, registry);
                    break;
                case 2:
                    System.out.println("Deleting... : ");
                    delCitizen(input, registry);
                    break;
                case 3:
                    System.out.println("Updating... : ");
                    updateCitizen(input, registry);
                    break;
                case 4:
                    System.out.println("Searching... :");
                    searchCitizen(input, registry);
                    break;
                case 5:
                    System.out.println("Printing... : ");
                    registry.printRegistry();
                    break;
            }
            if (choice == 6) {
                writeRegistryToFile(registry, filename);
            }
        } while (choice != 6);

        input.close();
        System.out.println("Exited!!!");
    }
}