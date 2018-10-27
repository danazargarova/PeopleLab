public class Classroom {
    private Student[] students;
    private Teacher teacher;

    public Classroom(Student[] students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }

    public String getSubject() {
        String sub ="";
        sub = teacher.getSubject();
        return sub;
    }

    public double getAvg() {
        double classAvg=0;
        for (int i=0; i < students.length; i++) {
            classAvg += students[i].getGPA();
        }
        return classAvg/students.length;
    }
    public String printClass() {
        return printClass()
    }

}