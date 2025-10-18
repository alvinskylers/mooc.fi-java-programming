package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name.length() > 40) 
            throw new IllegalArgumentException("name length should not be over than 40!");

        if (name.isEmpty())
            throw new IllegalArgumentException("nam should not be blank or null");

        if (age < 0 || age > 120) 
            throw new IllegalArgumentException("age should be between 0-120");
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
