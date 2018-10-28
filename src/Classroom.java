public class Classroom {
    /**
     * These are the fields, Student and Teacher, that would be initialized
     */
    private Student[] students;
    private Teacher teacher;

    /**
     * This is the constructor, initialziing Student and Teacher
     * @param students The students of the classroom
     * @param teacher The teacher of the classroom
     */
    public Classroom(Student[] students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }

    /**
     * This gets the subject of the teacher of the class
     * @return The class subject
     */
    public String getSubject() {
       return getSubject();
    }

    /**
     * This gets the class average of the students
     * @return Class average
     */
    public double getAvg() {
        double classAvg=0;
        for (int i=0; i < students.length; i++) {
            classAvg += students[i].getGPA();
        }
        return classAvg/students.length;
    }

    /**
     * Prints the details of the class
     * @return Class teacher, subject, and all the students of the class
     */
    public String printClass() {
        return printClass();
    }
}