public class Person {

    //Setting the string values?
    private String firstName;
    private String lastName;

    //This creates the person method
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //This is a method returns the person's first name
    public String getName() {
        return firstName;
    }

    //This is a method changes the name property to the passed value????
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello! %s %s" + firstName, lastName);
    }

    public static void main(String[] args) {
//       Person p = new Person ("Sam");
//
//       p.sayHello();
//
//       Person p2 = new Person("Justin");
//
//       p2.sayHello();

        Person person1 = new Person("John", "wick");
        Person person2 = new Person("John", "wick");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}