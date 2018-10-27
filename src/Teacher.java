public class Teacher extends Person{
    private String Subject;
    private String Title;

    public Teacher(String firstName, String familyName, String subject, String title) {
        super(firstName, familyName);
        Subject = subject;
        Title = title;
    }

    public String getSubject() {
        return Subject;
    }

    @Override
    public String toString() {
        return Title + "." + getFamilyName();
    }
}

