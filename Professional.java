public class Professional extends Golfer
{
    private String homeClub;

    public Professional(String firstName, String lastName, Gender gender, int age, String homeClub)
    {
        super(firstName, lastName, gender, age);
        this.homeClub = homeClub;
    }

    public String getDetails()
    {
        return "Name: " + getName() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Age: " + getAge() + "\n" +
                "Home Golf Club: " + homeClub + "\n" +
                "Handicap: Pro";
    }
}
