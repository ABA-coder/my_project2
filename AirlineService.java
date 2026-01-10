import java.util.ArrayList;

public class AirlineService {
    private ArrayList<Human> people = new ArrayList<>();

    public void addHuman(Human human) {
        people.add(human);
    }

    public void showAll() {
        for (Human h : people) {
            System.out.println(h);
        }
    }

    public void sortBySurname() {
        for (int i = 0; i < people.size() - 1; i++) {
            for (int j = i + 1; j < people.size(); j++) {
                if (people.get(i).surname.compareTo(people.get(j).surname) > 0) {
                    Human temp = people.get(i);
                    people.set(i, people.get(j));
                    people.set(j, temp);
                }
            }
        }
    }

    public void showPassengersOnly() {
        for (Human h : people) {
            if (h instanceof Passenger) {
                System.out.println(h);
            }
        }
    }
}
