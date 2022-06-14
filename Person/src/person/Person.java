package person;

public class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public void swapPerson(Person otherPerson) {
        String temp;
        temp = otherPerson.name;
        otherPerson.name = this.name;
        this.name = temp;
    }
}
