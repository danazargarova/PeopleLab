public class Person {
    private String firstName, familyName;
    public Person(String firstName, String familyName)
    {
        this.firstName = firstName;
        this.familyName = familyName;
    }
    public String getfirstName()
    {
        return firstName;
    }
    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getfamilyName()
    {
        return familyName;
    }
    public void setfamilyName(String familyName){
        this.familyName = familyName;
    }
    public boolean equals(Person person)
    {
        if(this.firstName.equals(person.getfirstName())&& this.familyName.equals(person.getfamilyName()))
        {
            return true;
        }
        else return false;
    }

    public String toString() {
        return familyName + ", " + firstName;
    }


}

