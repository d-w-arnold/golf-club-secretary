import java.util.ArrayList;
import java.util.Iterator;

public class GolfClub
{
    private String golfClubName;
    private ArrayList<Amateur> members;
    private ArrayList<Professional> professionals;

    public GolfClub(String golfClubName)
    {
        this.golfClubName = toTitleCase(golfClubName);
        members = new ArrayList<>();
        professionals = new ArrayList<>();
    }

    public String getGolfClubName()
    {
        return golfClubName;
    }

    public void setGolfClubName(String golfClubName)
    {
        this.golfClubName = toTitleCase(golfClubName);
    }

    public void addMember(Amateur amateur)
    {
        members.add(amateur);
    }

    public void removeMember(Amateur amateur)
    {
        Iterator<Amateur> it = members.iterator();
        while(it.hasNext()) {
            Amateur am = it.next();
            if(amateur.getName().equals(am.getName())) {
                it.remove();
            }
        }
    }

    public void addProfessional(Professional pro)
    {
        professionals.add(pro);
    }

    public void removeProfessional(Professional pro)
    {
        Iterator<Professional> it = professionals.iterator();
        while(it.hasNext()) {
            Professional professional = it.next();
            if(pro.getName().equals(professional.getName())) {
                it.remove();
            }
        }
    }

    public void amateurTurnsPro(Amateur amateur)
    {
        Iterator<Amateur> it = members.iterator();
        while(it.hasNext()) {
            Amateur am = it.next();
            if(amateur.getName().equals(am.getName())) {
                addProfessional(
                        new Professional(
                                amateur.getFirstName(),
                                amateur.getLastName(),
                                amateur.getGender(),
                                amateur.getAge(),
                                amateur.getHandicapDetails().getHomeClub()
                        )
                );
                it.remove();
            }
        }
    }

    public void printAllMembers()
    {
        System.out.println("##################################################");
        System.out.println(golfClubName + " Amateur's:\n");
        for(Amateur member : members) {
            System.out.println(member.getName());
        }
        System.out.println("##################################################\n");
    }

    public void printAllPros()
    {
        System.out.println("##################################################");
        System.out.println(golfClubName + " Professional's:\n");
        for(Professional pro : professionals) {
            System.out.println(pro.getName());
        }
        System.out.println("##################################################\n");
    }

    private String toTitleCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
