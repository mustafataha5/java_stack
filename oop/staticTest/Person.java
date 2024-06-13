public class Person {
    private int age;
    private String name;
    public static int numberOfPeople = 0;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfPeople++;
    }
    public static int peopleCount() {
        return numberOfPeople;
    }
}

