public class Runner {
    public static String[] firstNames = {"Jason", "Dana", "Sage", "Tobey", "Sam", "Holly", "Nathan"};
    public static String[] familyNames = {"Tan", "White", "Capricorn", "Mcguire", "Reimi", "Shoot", "Levin"};
    public static String[] classes = {"Math", "English", "Science", "Economics", "APCS"};
    public static String[] titles = {"Mr", "Ms", "Mrs", "Mx"};


    public static String randomfirstNames() {
        return firstNames[(int) (Math.random() * firstNames.length)];
    }

    public static String randomfamilyNames() {
        return familyNames[(int) (Math.random() * firstNames.length)];
    }


    public static void main (String[] args) {
        String subject = classes[(int) (Math.random() * classes.length)];
        String title = titles[(int) (Math.random() * titles.length)];
        Teacher classTeacher = new Teacher(randomfirstNames(), randomfamilyNames(), subject, title);
        Student[] students = new Student[6];
        for (int i = 0; i < students.length; i++) {
            students[i] = randomStudent();
        }
        Classroom classroom = new Classroom(students, classTeacher);
        classroom.printClass();
        System.out.println(classroom.classAverage());
    }

    private static Student randomStudent() {
        Student newStudent = new Student(randomfirstNames(), randomfamilyNames(), Math.random()*2+2, 17, 11);
        return newStudent;
    }


}