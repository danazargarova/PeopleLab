public class Teacher extends Person{
    private String subject;
    private String title;

    public Teacher(String firstName, String familyName, String subject, String title) {
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return title + ". " + getfamilyName();
    }
}

