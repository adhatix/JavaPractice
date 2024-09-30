class Person {
    private int age;
    private String name;

    public Person(int _age){
        this.age = _age;
    }

    public Person(int _age, String _name) {
        this.age = _age;
        this.name = _name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void celebrateBirthday() {
        ++this.age;
    }

    public void changeName(String _newName) {
        this.name = _newName;
    }
}



public class PersonTester {
    public static void main(String args[])
    {
        Person arish = new Person(15, "Arish Khan");
        System.out.println("Age Before: " + arish.getAge());
        System.out.println("Name Before: " + arish.getName());
        arish.celebrateBirthday();
        arish.changeName("Joel");
        System.out.println("Age After: " + arish.getAge());
        System.out.println("Name after: " + arish.getName());
    }
}
