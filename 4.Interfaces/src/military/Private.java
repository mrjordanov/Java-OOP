package military;

public class Private extends SoldierImpl {

    private double salary;

    public Private(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return super.toString() + " Salary: " + String.format("%.2f", salary);
    }

    @Override
    public String getInformation() {
        return toString();
    }

    @Override
    public int getId() {
        return super.getId();
    }


}
