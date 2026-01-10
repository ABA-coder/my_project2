public abstract class Human {
    protected String name;
    protected String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return name + " " + surname + " (" + getRole() + ")";
    }
}
