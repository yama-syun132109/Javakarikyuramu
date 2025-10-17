package curriculumC;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("山下駿輔", 23, 1.7, 84.3);
        person1.print();
        Person.printCount();
    }
}
