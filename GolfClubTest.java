import org.junit.After;
import org.junit.Before;
import java.time.LocalDate;

public class GolfClubTest
{
    public GolfClub golfClub;
    public Professional andrew;
    public Professional charlie;
    public Junior gareth;
    public Junior sam;
    public Adult dave;
    public Adult mark;
    public Artisan jim;

    public GolfClubTest()
    {
        golfClub = new GolfClub("Littlestone");
        andrew = new Professional("Andrew", "Jones", Gender.MALE, 42, "Littlestone");
        charlie = new Professional("Charlie", "Wilson", Gender.MALE, 32, "Littlestone");
        gareth = new Junior(
                "Gareth",
                "Shepphard",
                Gender.MALE, 13,
                new Handicap("The Ridge", 13),
                new Membership(1000, LocalDate.of(2018, 9, 19), LocalDate.of(2018, 9, 19))
        );
        sam = new Junior(
                "Sam",
                "Britain",
                Gender.MALE, 13,
                new Handicap("Canterbury", 16),
                new Membership(1000, LocalDate.of(2018, 9, 19), LocalDate.of(2018, 9, 19))
        );
        dave = new Adult(
                "Dave",
                "Munn",
                Gender.MALE, 80,
                new Handicap("The Ridge", 13),
                new Membership(1000, LocalDate.of(2018, 9, 19), LocalDate.of(2018, 9, 19))
        );
        mark = new Adult(
                "Mark",
                "Singfield",
                Gender.MALE, 50,
                new Handicap("The Ridge", 13),
                new Membership(1000, LocalDate.of(2018, 9, 19), LocalDate.of(2018, 9, 19))
        );
        jim = new Artisan(
                "Jim",
                "Cameron",
                Gender.MALE, 55,
                new Handicap("The Ridge", 13),
                new Membership(1000, LocalDate.of(2018, 9, 19), LocalDate.of(2018, 9, 19)),
                50,
                100

        );

        golfClub.addProfessional(andrew);
        golfClub.addProfessional(charlie);
        golfClub.addMember(gareth);
        golfClub.addMember(sam);
        golfClub.addMember(dave);
        golfClub.addMember(mark);
        golfClub.addMember(jim);
    }

    /**
     * Sets up the test fixture. Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture. Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
