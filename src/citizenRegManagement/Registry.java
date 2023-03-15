package citizenRegManagement;

import java.util.HashSet;
import java.util.Set;

public class Registry {
    private String name;
    private Set<Citizen> sitizens = new HashSet<Citizen>();

    public Registry(String name) {
        this.name = name;
    }


}
