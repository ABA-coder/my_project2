public class CrewMember extends Human {
    private String position;

    public CrewMember(String name, String surname, String position) {
        super(name, surname);
        this.position = position;
    }

    @Override
    public String getRole() {
        return "Crew Member: " + position;
    }
}
