import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers); // [I@3f0ee7cb
        String numbersString = Arrays.toString(numbers);
        System.out.println(numbersString);
        Person[] personArray = {new Person("Kat"), new Person("Hazel"), new Person("Jesus")};
        for (Person person : personArray) {
            System.out.println(person.getName());
        }
        Person[] newArr = addPerson(personArray, new Person("Lemon Demon"));
        for (Person person: newArr) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] personObjArr, Person newPersonObj) {
        int arrLength = personObjArr.length;
        Person[] newArr = Arrays.copyOf(personObjArr, arrLength + 1);
        newArr[newArr.length - 1] = newPersonObj;
        return newArr;
    }
}
