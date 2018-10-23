public class Student extends Person {
    private double GPA;
    private int age;
    private int grade;

    public Student(String firstName, String familyName, double GPA, int age, int grade) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.age = age;
        this.grade = grade;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
