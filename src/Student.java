public class Student extends Person {
    private double GPA;
    private int age;
    private int grade;

    /**
     * This method creates a student that has a first and last name,GPA,Grade Level, age
     * @param firstName this is the students fitst name .
     * @param familyName this is the students last name.
     * @param GPA the students grade point average.
     * @param age this is the students age.
     * @param grade the grade the student is in.
     */
    public Student(String firstName, String familyName, double GPA, int age, int grade) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.age = age;
        this.grade = grade;
    }

    public double getGPA() {
        return GPA;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
