public class Person {
    private String name;
    // Person constructor
    public Person(String name) {
        setName(name);
    }

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
        Person testPerson = new Person("Kat");
        System.out.println("testPerson.getName() = " + testPerson.getName());
        testPerson.sayHello();
    }
}
