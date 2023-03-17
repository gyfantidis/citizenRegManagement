package citizenRegManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

import static citizenRegManagement.Menu.*;


public class Main {
    public static void main(String[] args) {

        //Creation the Citizens Registry
        Registry registry = new Registry("Citizens Registry");

        //Start the menu


        int choice = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("MENU for Registry Management");
            System.out.println();
            System.out.println("1) Add new Citizen into the Registry");
            System.out.println("2) Delete Citizen from the Registry");
            System.out.println("3) Update Citizens AFM or Address");
            System.out.println("choice 4");
            System.out.println("5 Print the Registry");
            System.out.println("6) to Exited!!!");
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Did not give an integer!");
                break;
            }
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Adding new Citizen : ");
                    addNewCitizen(input, registry);
                    break;
                case 2:
                    System.out.println("Deleting Citizen : ");
                    delCitizen(input, registry);
                    break;
                case 3:
                    System.out.println("Updating : ");
                    updateCitizen(input, registry);
                    break;
                case 4:
                    System.out.println("epelekses 4");
                    break;
                case 5:
                    System.out.println("Printing : ");
                    registry.printRegistry();
                    break;
            }

        } while (choice != 6);

        input.close();
        System.out.println("Exited!!!");


    }
}