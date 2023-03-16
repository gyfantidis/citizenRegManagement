package citizenRegManagement;

import java.util.HashSet;
import java.util.Set;

public class Registry {
    private String name;
    private Set<Citizen> citizens = new HashSet<Citizen>();

    public Registry(String name) {
        this.name = name;
    }

    //checking if the citizen exist in the Registry
    public boolean findCitizen(Citizen cz){
        for (Citizen citizen: citizens){
            if (citizen.getAt().equals(cz.getAt())){
                return true;
            }
        }
        return false;
    }

    //checking if the citizens ID Number exist in the Registry
    public boolean findCitizensID(String idNumber){
        for (Citizen citizen: citizens){
            if (citizen.getAt().equals(idNumber)){
                return true;
            }
        }
        return false;
    }


    //add new citizen
    public void addCitizen(Citizen cz){
        citizens.add(cz);
    }

    //delete citizen
    public void delCitizen(Citizen cz){
        citizens.remove(cz);
    }

    //find citizen from ID Number
    public Citizen findCitizenFromIDNumber(String idNumber){
        for (Citizen citizen: citizens){
            if (citizen.getAt().equals(idNumber)){
                return citizen;
            }
        }

    }






}
