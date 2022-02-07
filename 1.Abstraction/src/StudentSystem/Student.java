package StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" is ").append(age).append(" years old. ");
        sb.append(getCommentary(grade)).append("\n");
        return sb.toString();
    }

    private String getCommentary(double grade) {
        if (grade >= 5.00) {
            return "Excellent student.";
        } else if (grade >= 3.50) {
            return "Average student.";
        }
        return "Very nice person.";
    }

}
