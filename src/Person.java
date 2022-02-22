public class Person {
    private String name;

    // Person constructor
    public Person(String name) {
        setName(name);
    }

    // Person methods
    public String getName(){
        //TODO: return the person's name
        return this.name;
    }
    public void setName(String name){
        //TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s", getName());
    }

    public static void main(String[] args) {
//        Person testPerson = new Person("Kat");
//        System.out.println("testPerson.getName() = " + testPerson.getName());
//        testPerson.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true. the name value is the same string
//        System.out.println(person1 == person2); // false. they are declared separately

//        Person person1 = new Person("John");
//        Person person2 = person1; // we are declaring person2 IS person1. same name value, same object value
//        System.out.println(person1 == person2); // always returns true

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); // "John"
        System.out.println(person2.getName()); // "John"
        person2.setName("Jane");
        System.out.println(person1.getName()); // "Jane" since person 2 IS person 1, changing the name value affects the same object
        System.out.println(person2.getName()); // "Jane"
    }
}
