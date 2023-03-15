package citizenRegManagement;

import java.util.HashSet;
import java.util.Set;

public class Registry {
    private String name;
    private Set<Citizen> citizens = new HashSet<Citizen>();

    public Registry(String name) {
        this.name = name;
    }

    public boolean addCitizen(Citizen cz){
        for (Citizen citizen: citizens){
            if (citizen.getAt().equals(cz.getAt())){
                return false;
            }
        }
        return citizens.add(cz);
    }


}
