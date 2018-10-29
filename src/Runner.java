public class Runner {
    public static String[] firstNames = {"Jason", "Dana", "Sage", "Tobey", "Sam", "Holly", "Nathan"};
    public static String[] familyNames = {"Tan", "White", "Capricorn", "Mcguire", "Reimi", "Shoot", "Levin"};

    public static String[] classes = {"Math", "English", "Science", "Economics", "APCS"};

    public static String [] period9;

    public static void classmaker
    {
        for (int i=0, i<=30, i++){

    }
    }


    public static String randomfirstNames() {
        return firstNames[(int) (Math.random() * firstNames.length)];
    }

    public static String randomfamilyNames() {
        return familyNames[(int) (Math.random() * firstNames.length)];
    }


    public static void main (String[] args) {
        Teacher classTeacher = new Teacher(randomfirstNames(), randomfamilyNames(), "Computer Science", "Mr");
        Student[] students = new Student[6];
        for (int i = 0; i < students.length; i++) {
            students[i] = ranStudent();

        }
    }

    private static Student ranStudent() {
        Student newStudent = new Student(randomfirstNames(), randomfamilyNames(), Math.random()*2+2, 17, 11);
        return newStudent;
    }
i like turtles

}