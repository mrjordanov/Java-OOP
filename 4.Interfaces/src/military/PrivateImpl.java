package military;

public class PrivateImpl extends SoldierImpl implements Soldier {

    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return super.toString() + salary;
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
