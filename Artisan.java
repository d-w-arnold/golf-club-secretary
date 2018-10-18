public class Artisan extends Amateur
{
    // Rounds of golf permitted in a year.
    private int maxRounds;

    private int roundsRemaining;

    // Days that must be fulfilled as work for the golf club a year.
    private int maxDays;

    private int daysRemaining;

    public Artisan(String firstName, String lastName, Gender gender, int age, Handicap handicap, Membership membership, int rounds, int days)
    {
        super(firstName, lastName, gender, age, handicap, membership);
        this.maxRounds = rounds;
        this.roundsRemaining = rounds;
        this.maxDays = days;
        this.daysRemaining = days;
    }

    public int remainingRoundsOfGolf()
    {
        return roundsRemaining;
    }

    public int remainingDaysOfWork()
    {
        return daysRemaining;
    }

    public void roundOfGolf()
    {
        roundsRemaining--;
    }

    public void dayOfWork()
    {
        daysRemaining--;
    }

    public void resetRoundsOfGolf()
    {
        roundsRemaining = maxRounds;
    }

    public void resetDaysOfWork()
    {
        daysRemaining = maxDays;
    }

    public void setRoundsOfGolf(int rounds)
    {
        if (rounds > getMaxRounds()) {
            System.out.println(rounds + " rounds of golf cannot be set. Maximum number rounds of golf: " + getMaxRounds());
            return;
        }
        this.roundsRemaining = rounds;
    }

    public void setDaysOfWork(int days)
    {
        if (days > getMaxDays()) {
            System.out.println(days + " days of work cannot be set. Maximum number days of work: " + getMaxDays());
            return;
        }
        this.daysRemaining = days;
    }

    public int getMaxRounds()
    {
        return maxRounds;
    }

    public void setMaxRounds(int rounds)
    {
        this.maxRounds = rounds;
    }

    public int getMaxDays()
    {
        return maxDays;
    }

    public void setMaxDays(int days)
    {
        this.maxDays = days;
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
