public class Teacher extends Person{
    private String Subject;
    private String Title;
    String [] Title={"Mr", "Ms", "Mx", "Mrs"};

    public Teacher(String firstName, String familyName, String subject, String title) {
        super(firstName, familyName);
        Subject = subject;
        Title = title;
    }
}
