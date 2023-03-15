package citizenRegManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

import static citizenRegManagement.Menu.addNewCitizen;

public class Main {
    public static void main(String[] args) {

        //Creation the Citizens Registry
        Registry registry = new Registry("Citizens Registry");

        //Start the menu
        System.out.println("MENU for Registry Management");
        int choice = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Add new Citizen into the Registry");
            System.out.println("Choice 2");
            System.out.println("Choice 3");
            System.out.println("choice 4");
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Did not give an integer!");
            }
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Add a Citizen into the Registry");
                    addNewCitizen(input,registry);
                    break;
                case 2:
                    System.out.println("epelekses 2");
                    break;
                case 3:
                    System.out.println("epelekses 3");
                    break;
                case 4:
                    System.out.println("epelekses 4");
                    break;
            }

        } while (choice >= 1 && choice <= 4);

        input.close();
        System.out.println("Exited!!!");


    }
}