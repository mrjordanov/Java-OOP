package military;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;


public class Commando extends SoldierImpl {

    double salary;
    String corp;
    List<Mission> missions;

    public Commando(int id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName);
        this.salary = salary;
        this.corp = corp;
        this.missions = new LinkedList<>();
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.missions.forEach(m -> sb.append(m.toString()).append("\n"));


        if (sb.length() == 0) {
            return super.toString() + " Salary: " + String.format("%.2f", salary) + "\nCorps: " + corp + "\nMissions:";
        } else {
            return super.toString() + " Salary: " + String.format("%.2f", salary) + "\nCorps: " + corp + "\nMissions:\n  " + sb.toString().trim();
        }
    }

    @Override
    public String getInformation() {
        return toString();
    }
}
