public class Classroom {
    private Student[] students;
    private Teacher teacher;

    public Classroom(Student[] stus, Teacher teach) {
        this.students = stus;
        this.teacher = teach;
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
    public void printClass() {
        System.out.println(teacher, getSubject(), students);
    }

}