package military;

import java.util.LinkedHashMap;
import java.util.Map;

public class Commando extends SoldierImpl {

    double salary;
    String corp;
    Map<String, Integer> missions;

    public Commando(int id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName);
        this.salary = salary;
        this.corp = corp;
        this.missions = new LinkedHashMap<>();
    }

    public Map<String, Integer> getMissions() {
        return missions;
    }

    @Override
    public String getInformation() {
        return null;
    }
}
