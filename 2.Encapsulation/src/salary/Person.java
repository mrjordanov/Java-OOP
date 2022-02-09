package salary;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double increment) {
        if (this.age < 30) {
            increment = increment / 2;
        }
        this.salary += this.salary * increment / 100;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName + " gets " + salary + " leva";
    }
}
