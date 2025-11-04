import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortPerson = this.persons.get(0);
        for (Person person : persons) {
            if (shortPerson.getHeight() > person.getHeight()) {
                shortPerson = person;
            }
        }
        return shortPerson;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person person = shortest();
        this.persons.remove(person);
        
        return person;
    }
}
