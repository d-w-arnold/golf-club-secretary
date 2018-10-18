public class Adult extends Amateur
{

    public Adult(String firstName, String lastName, Gender gender, int age, Handicap handicap, Membership membership)
    {
        super(firstName, lastName, gender, age, handicap, membership);
    }

    public String getDetails()
    {
        return "Name: " + getName() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Age: " + getAge() + "\n" +
                "Home Golf Club: " + getHandicapDetails().getHomeClub() + "\n" +
                "Handicap: " + getHandicapDetails().getHandicap() + "\n" +
                getMembershipDetails();
    }
}
