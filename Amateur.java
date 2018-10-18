public abstract class Amateur extends Golfer
{
    private Handicap handicap;
    private Membership membership;

    public Amateur(String firstName, String lastName, Gender gender, int age, Handicap handicap, Membership membership)
    {
        super(firstName, lastName, gender, age);
        this.handicap = handicap;
        this.membership = membership;
    }

    public Handicap getHandicapDetails()
    {
        return handicap;
    }

    public String getMembershipDetails()
    {
        return membership.getDetails();
    }

    abstract public String getDetails();
}
