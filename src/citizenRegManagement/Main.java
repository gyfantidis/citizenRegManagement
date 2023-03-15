package citizenRegManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Citizen citizen = new Citizen("123", "Giannis", "Yfantidis", "male", "10/3/1982", "123456789", "Pontoy 25");

        System.out.println(citizen.toString());

        Registry registry = new Registry("Citizens Registry");
        System.out.println("MENU for Registry Management");
        int choice = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("choice1");
            System.out.println("Choice 2");
            System.out.println("Choise 3");
            System.out.println("choice 4");
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Did not give an integer!");
            }
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("epelekses 1");
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