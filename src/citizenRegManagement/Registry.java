package citizenRegManagement;

import java.util.HashSet;
import java.util.Set;

public class Registry {
    private String name;
    private  Set<Citizen> citizens = new HashSet<Citizen>();

    public Registry(String name) {
        this.name = name;
    }


    //checking if the citizen exist in the Registry and add it
    public boolean addCitizen(Citizen cz) {
        for (Citizen citizen : citizens) {
            if (citizen.getAt().equals(cz.getAt())) {
                return false;
            }
        }
        return citizens.add(cz);
    }

    //checking if the citizens ID Number exist in the Registry and delete it
    public boolean deleteCitizen(String idNumber) {
        for (Citizen citizen : citizens)
            if (citizen.getAt().equals(idNumber)) {
                return citizens.remove(citizen);
            }
        return false;
    }

    //update citizens AFM or Address
    public boolean updateCit(String idNumber, int choice, String updateData){
        for (Citizen citizen : citizens)
            if (citizen.getAt().equals(idNumber)) {
               if (choice==1){
                   citizen.setAfm(updateData);
               }
               else if (choice ==2){
                    citizen.setAddress(updateData);
               }
               return true;
            }
        return false;
    }

    @Override
    public String  toString() {
        return "Registry{" +
                "citizens=" + citizens +
                '}';
    }
}







