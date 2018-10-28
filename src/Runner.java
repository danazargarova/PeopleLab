public class Runner {
    public static String[] firstNames = {"Jason","Dana", "Sage","Tobey", "Sam", "Holly"};
    public static String[] lastNames = {"Tan", "White","Capricorn", "Mcguire", "Reimi","Shoot"};

    public static String[] classes= {"Math", "English", "Science", "Economics","APCS"};

    public static void main(String[] args) {
            Teacher classTeacher = new Teacher(randomFirstName(), randomFamilyName(),"Computer Science","Mr");
            Student[] students = new Student[32];
            for(int i = 0; i < students.length; i++){
                students[i] = randomStudent();

    }
}
