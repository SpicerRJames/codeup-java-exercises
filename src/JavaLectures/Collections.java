package JavaLectures;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts
        //   add light, medium, medium, dark to the array list, one at a time
        ArrayList<String> roasts = new ArrayList<>();

        roasts.add("Java");
        roasts.add("Dark");
        roasts.add("Light");
        roasts.add("Medium");
        roasts.add("Mocha");

//        System.out.println(roasts);
        // 2. Check to see if the list contains "dark" , and then "espresso"
        boolean result;
        result = roasts.contains("Dark");
//        System.out.println(result);
        result = roasts.contains("Big Mac");
//        System.out.println(result);

        // 3. Find the last index of "medium" in the array
        int index = roasts.indexOf("Medium");
//        System.out.println(index);

        // 4. Check if the array list is empty
        result = roasts.isEmpty();
//        System.out.println(result);

        // 5. Assign the array list an empty ArrayList object, and then check if empty
        ArrayList<String> emptyList = new ArrayList<>();
        result = emptyList.isEmpty();
//        System.out.println(result);

            //5.a Add a roast
            roasts.add("Espresso");
//            System.out.println(roasts);

        // 6. Remove the espresso roast
        roasts.remove("Espresso");
//        System.out.println(roasts);

        // 7. Remove the element at index 2
        roasts.remove(2);
//        System.out.println(roasts);


        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name
        //   b. Github username
        HashMap<String, String> usernames = new HashMap<>();

        usernames.put("James", "Sicer");
        usernames.put("Victor", "Bernal");
        usernames.put("Alex", "Soto");

        System.out.println(usernames);
        // 2. re-initialize the HashMap using the .clear() method
        usernames.clear();
        System.out.println(usernames);
        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        usernames.put("Casey", "Friday");
        System.out.println(usernames);

        // 4. use the .putIfAbsent() method to add
        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        usernames.putIfAbsent("Vivian", "viviancan");
        usernames.putIfAbsent("Casey", "XpenguinX");
        System.out.println(usernames);

        // 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
            //Only checks if the key is absent, and will not add the key if present

        // 6. Use the .remove() method to remove "Casey"
        usernames.remove("Casey");
        System.out.println(usernames);

        // 7. Use the .replace() method to change Vivian's username to "viviancandev"
        usernames.replace("Vivian", "viviancandev");
        System.out.println(usernames);

        // 8. Use the .clear() method to clear the map
        usernames.clear();
        System.out.println(usernames);

        // 9. Use the .isEmpty() method to verify that it was cleared
        result = usernames.isEmpty();
        System.out.println(result);

    }
}