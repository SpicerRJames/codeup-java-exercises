/*
Create an input validation class

Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner. When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:

String getString()
boolean yesNo()
int getInt(int min, int max)
int getInt()
double getDouble(double min, double max)
double getDouble()
The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.

The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.

Create another class named InputTest that has a static main method that uses all of the methods from the Input class.
*/

package util;
import java.util.Scanner;

public class Input {

    private static Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }


    static String getString(String prompt) throws Exception{
        //if there is no scanner set
        if(scanner == null){
            throw new Exception("Scanner is not set");
        }

//        System.out.println("Enter a quote");
//        String in = scanner.next();

        //if there is a scanner set
        String inputString;
        if(prompt != null){
            System.out.println(prompt);
        }
        inputString = scanner.nextLine();
        return inputString;
    }

    public static String getString() throws Exception{
        return getString(null);
    }

//    boolean yesNo() {
//        System.out.println("Enter y for true");
//        String in = scanner.next();
//        return in.equalsIgnoreCase("y");
//
//    }

    public static boolean yesNo(String prompt) throws Exception{
        if(scanner == null){
            throw new Exception("Input not set for yesNo");
        }
        boolean response;
        if(prompt != null){
            System.out.println("pres y for yes");
        } else {
            System.out.println("you did not press y");
        }
        response = scanner.nextLine().toLowerCase().contains("y");
        return response;
    }

    public int getInt (int min, int max){
        System.out.println("Enter one number");
        min = 10;
        max = 100;
        int num = scanner.nextInt();

        if (num <= max || num >= min){
            System.out.print("%int is in rage");
        } else {
            System.out.println("Number not in range");
        }
        return num;
    }

    int getInt(){
        return getInt();
    }

    double getDouble(double min, double max){
        System.out.println("Enter one number");
        min = 10;
        max = 100;
        int num = scanner.nextInt();

        if (num <= max || num >= min){
            System.out.print("%int is in rage");
        } else {
            System.out.println("Number not in range");
        }
        return num;
    }

    double getDouble(){
        return getDouble();
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Input in = new Input();
//        System.out.println(in.getString());
        System.out.println(in.getInt(0, 0));

        String quote = Input.getString("What is your favorite quote");
        System.out.println(quote);

        boolean containsY = Input.yesNo("Press y");
        if(containsY){
            System.out.println("you did it");
        } else {
            System.out.println("you did not");
        }
    }

    public double getDouble(String s) {
    }
}

































