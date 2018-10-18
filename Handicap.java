public class Handicap
{
    private String homeClub;
    private double handicap;
    private int handicapCategory;
    private int handicapBuffer;
    private double handicapReduce;

    public Handicap(String homeClub, double handicap)
    {
        this.homeClub = homeClub;
        this.handicap = handicap;
        setCategoryBufferReduce();
    }

    public String getHomeClub()
    {
        return homeClub;
    }

    public void setHomeClub(String club)
    {
        homeClub = club;
    }

    public double getHandicap()
    {
        return handicap;
    }

    public void setHandicap(double handicap)
    {
        this.handicap = handicap;
        setCategoryBufferReduce();
    }


    public int getHandicapCategory()
    {
        return handicapCategory;
    }

    public int getHandicapBuffer()
    {
        return handicapBuffer;
    }

    public double getHandicapReduce()
    {
        return handicapReduce;
    }

    public void adjustHandicapFromCompetition(int grossScore, int CSS)
    {
        long nettScore = grossScore - Math.round(handicap);
        if (CSS > nettScore) {
            handicap = handicap - ((CSS - nettScore) * handicapReduce);
            setCategoryBufferReduce();
        } else if (nettScore > (CSS + handicapBuffer)) {
            handicap = handicap + 0.1;
            setCategoryBufferReduce();
        }
    }

    private void setCategoryBufferReduce()
    {
        long integer = Math.round(handicap);
        if(integer <= 5) {
            handicapCategory = 1;
            handicapBuffer = 1;
            handicapReduce = 0.1;
        }
        if(integer >= 6 && integer <= 12) {
            handicapCategory = 2;
            handicapBuffer = 2;
            handicapReduce = 0.2;
        }
        if(integer >= 13 && integer <= 20) {
            handicapCategory = 3;
            handicapBuffer = 3;
            handicapReduce = 0.3;
        }
        if(integer >= 21 && integer <= 28) {
            handicapCategory = 4;
            handicapBuffer = 4;
            handicapReduce = 0.4;
        }
        if(integer >= 29 && integer <= 36) {
            handicapCategory = 5;
            handicapBuffer = 5;
            handicapReduce = 0.5;
        }
    }
}
