
package citizenRegManagement;

import java.util.Scanner;

public class Menu {

    //method adding new citizen into the registry
    static void addNewCitizen(Scanner input, Registry registry) {
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
        boolean result = registry.findCitizen(citizen);
        if (!result) {
            System.out.println(citizen + " added successfully!");
            registry.addCitizen(citizen);
        } else
            System.out.println("Probably " + citizen + " already in Registry.");

    }

    static  void delCitizen(Scanner input, Registry registry) {
        System.out.println("Citizens ID Number : ");
        String idNumber = input.next();


        //delete the citizen, if id number not exist return a message
        boolean result = registry.findCitizensID(idNumber){
            if(result){
                System.out.println("deleted successfully!");
                registry.findCitizenFromIDNumber(idNumber);
            }
        }

    }




}
