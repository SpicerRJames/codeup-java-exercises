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

    public Input(){
        scanner = new Scanner(System.in);
    }

    private Scanner scanner;

    String getString(){
        System.out.println("Enter a quote");
        String in = scanner.next();
        return in;
    }

    boolean yesNo(){
        System.out.println("Enter y for true");
        String in = scanner.next();
        return in.equalsIgnoreCase("y");

    }

//    int getInt(int min, int max){
//        min = 10;
//        max = 100;
//        int in = scanner.nextInt();
//        if(in > 100){
//            System.out.println("Number is over the max");
//        }
//        return getInt();
//    }
//    double getDouble(double min, double max){
//        return getInt();
//    }
//    double getDouble(){
//        return getDouble();
//    }

    public static void main(String[] args){
        Input in = new Input();
        System.out.println(in.yesNo());
        System.out.println(in.getString());
    }

}

































