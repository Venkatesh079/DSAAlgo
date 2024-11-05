package collections.customobjects;

import java.util.*;


/**
 * Custom Objects:
 * Create a class Person with name and age fields.
 * Create a List of Person objects.
 * Sort the list by age and print the sorted list.
 * Sort the list by name and print the sorted list.
 */
public class PersonListDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<String> names = Arrays.asList("John Doe", "Jane Doe", "Alice", "Bob", "Charlie", "Dave", "Eve", "Frank", "Grace", "Hank", "Ivy", "Jack");
        Random random = new Random();
        for (int i = 13; i < 25; i++)
        {
            Person person = new Person();
            String name = names.get(random.nextInt(names.size()));
            person.setAge(i);
            person.setName(name);
            people.add(person);
        }
        System.out.println(Arrays.toString(people.toArray()));
        sortByAge(people);
        System.out.println(Arrays.toString(people.toArray()));

    }

    private static void sortByAge(List<Person> people) {
        people.sort(Comparator.comparing(Person::getName));
    }
}
