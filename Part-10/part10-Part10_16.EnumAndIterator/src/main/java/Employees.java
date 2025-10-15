import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
 
    private List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
            .forEach(p -> persons.add(p));
    }

    public void print() {
        persons.stream()    
            .forEach(p -> System.out.println(p));
    }

    public void print(Education education) {
       Iterator<Person> iterator = persons.iterator();

       while(iterator.hasNext()) {
            if (iterator.next().getEducation().ordinal() == education.ordinal())
                print();
       }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
