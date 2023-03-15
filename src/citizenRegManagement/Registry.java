package citizenRegManagement;

import java.util.HashSet;
import java.util.Set;

public class Registry {
    private String name;
    private Set<Citizen> citizens = new HashSet<Citizen>();

    public Registry(String name) {
        this.name = name;
    }

    //checking if the citizens IDNumber exist and if no adding the citizen
    public boolean addCitizen(Citizen cz){
        for (Citizen citizen: citizens){
            if (citizen.getAt().equals(cz.getAt())){
                return false;
            }
        }
        return citizens.add(cz);
    }


}
