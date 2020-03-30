import java.util.Arrays;
public class ArraysExercises {


//    Array Basics
//
//    Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
//
//    What happens when you run the following code? Why is Arrays.toString necessary?
//
//    int[] numbers = {1, 2, 3, 4, 5};
//    System.out.println(numbers);
//    Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
//    Iterate through the array and print out the name of each person in the array.
//
//    Create a static method named addPerson. It should accept an array of Person objects,
//    as well as a single person object to add to the passed array. It should return an array whose
//    length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        Person("Salem")
        Person[] persons = {new Person("James", "Spicer"), new Person("Dylan", "Manuel"), new Person("Shane", "Dymond")};
        Person p = new Person("John", "Doe");
//        System.out.println(p.getName());
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName());
        }

        Person[] newPeople = addPerson(persons, p);
        for (int i = 0; i < newPeople.length; i++) {
            System.out.println("\n" + newPeople[i].getName());
        }
    }


    public static Person[] addPerson(Person[] incomingPeople, Person p) {
//        System.out.println("Here is a list of people: " + persons + p);

        int plus = incomingPeople.length + 1;

        Person[] bucket = Arrays.copyOf(incomingPeople, plus);

        int blength = bucket.length - 1;

        bucket[blength] = p;

        return bucket;


//        array Arrays.copyOf(array, length)




//        for (int i = 0; i < persons.length; i++) {
//            System.out.println(persons[i].getName());
//        }
//        return addPerson();
    }
}
//comment 4
