import java.text.DecimalFormat;
import java.time.LocalDate;

public class Membership
{
    // Annual green fee.
    private double greenFee;

    // Date membership starts.
    private LocalDate startDate;

    // Date membership terminates.
    private LocalDate endDate;

    public Membership(double greenFee, LocalDate startDate, LocalDate endDate)
    {
        this.greenFee = greenFee;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDetails()
    {
        return "Green Fee: £" + currencyFormat(greenFee) + "\n" +
                "Start Date: " + startDate + "\n" +
                "End Date: " + endDate;
    }

    private String currencyFormat(double db)
    {
        String text = Double.toString(Math.abs(db));
        DecimalFormat df2 = new DecimalFormat(".##");
        if (text.length() - text.indexOf('.') - 1 == 1) {
            return df2.format(db) + "0";
        }
        return df2.format(db);
    }
}
