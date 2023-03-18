package citizenRegManagement;

import java.io.*;

public class readAndWriteFile {



    public static void writeRegistryToFile(Registry r, String filename) {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(filename));
        } catch (Exception e) {
            System.out.println("Something went wrong while opening file for writing");
            System.out.println("Cause : " + e.getMessage());
            System.out.println("Exiting!!!");
            System.exit(-1);
        }

        try {
            oos.writeObject(r);
            oos.close();
        } catch (Exception e) {
            System.out.println("Something went wrong while attempting to write the state");
            System.out.println("Cause : " + e.getMessage());
            System.out.println("Exiting!!!");
            System.exit(-1);
        }
    }


    public static Registry readRegistryFromFile(String filename) {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(filename));
        } catch (Exception e) {
            System.out.println("Something went wrong while opening file for reading");
            System.out.println("Cause : " + e.getMessage());
            return null;
        }

        try {
            Registry r = (Registry) ois.readObject();
            ois.close();
            return r;
        } catch (Exception e) {
            System.out.println("Something went wrong while attempting to read the state");
            System.out.println("Cause : " + e.getMessage());
            System.out.println("Exiting!!!");
            System.exit(-1);
        }

        return null;


    }

}
