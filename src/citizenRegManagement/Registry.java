package citizenRegManagement;

import java.util.HashSet;
import java.util.Set;

public class Registry {
    private String name;
    private Set<Citizen> citizens = new HashSet<Citizen>();

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

    //checking if the citizens ID Number exist in the Registry
    public boolean deleteCitizen(String idNumber) {
        for (Citizen citizen : citizens)
            if (citizen.getAt().equals(idNumber)) {
                return citizens.remove(citizen);
            }
        return false;
    }


}







