public class Runner {
    public static String[] firstNames = {"Jason","Dana", "Sage","Tobey", "Sam", "Holly"};
    public static String[] familyNames = {"Tan", "White","Capricorn", "Mcguire", "Reimi","Shoot"};

    public static String[] classes= {"Math", "English", "Science", "Economics","APCS"};

    public static void randomfirstNames() {
        String fname=firstNames[(int)(Math.random()*firstNames.length)];
    }

    public static void randomlastNames() {
        String lname=familyNames[(int)(Math.random()*familyNames.length)];
    }

    public static Student ranStudent() {
    Student newStudent= new Student(fname,  lname );
    return newStudent;
    }


}

    public static void main(String[] args) {
            Teacher classTeacher = new Teacher(firstNames(),familyNames(),"Computer Science","Mr");
            Student[] students = new Student[6];
            for(int i = 0; i < students.length; i++){
                students[i] = randomStudent();

    }
}
