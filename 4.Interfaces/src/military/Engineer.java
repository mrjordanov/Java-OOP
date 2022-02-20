package military;


import java.util.LinkedHashMap;
import java.util.Map;

public class Engineer extends SoldierImpl {

    double salary;
    String corp;
    Map<String, Integer> repairs;

    protected Engineer(int id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName);
        this.salary = salary;
        this.corp = corp;
        this.repairs = new LinkedHashMap<>();
    }


    public void addRepair(Repair repair) {
        this.repairs.put(repair.getPartName(), repair.getHoursOfRepair());
    }

    public Map<String, Integer> getRepairs() {
        return repairs;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        getRepairs().forEach((key, value) -> sb.append("  Part Name: ").append(key).append(" Hours Worked: ").append(value).append("\n"));
        if (sb.isEmpty()) {
            return super.toString() + " Salary: " + salary + "\nCorps: " + corp + "\nRepairs:";
        } else {
            return super.toString() + " Salary: " + salary + "\nCorps: " + corp + "\nRepairs:\n  " + sb.toString().trim();
        }
    }

    @Override
    public String getInformation() {
        return toString();
    }
}
