import java.util.Arrays;

public class ArrayExercises {

    public static Person[] addPerson(Person[] array, Person newPerson) {
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
        return people;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] people = new Person[3];

        people[0] = new Person("Evan");
        people[1] = new Person("Dave");
        people[2] = new Person("Josh");

        System.out.println(Arrays.toString(people));


        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person sophia = new Person("Sophia");
        people = addPerson(people,sophia);

        for (Person person : people) {
            System.out.println(person.getName());
        }



    }
}
