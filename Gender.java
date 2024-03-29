public enum Gender
{
    MALE("Male"), FEMALE("Female");

    private final String gender;

    Gender(final String gender)
    {
        assert gender != null : "Not specified";
        this.gender = toTitleCase(gender);
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
