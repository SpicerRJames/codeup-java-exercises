import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {

//-------------------------QUESTION 1------------------------------\\

//     static void addition(){
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         System.out.println(num1 + num2);
//         System.out.println(num1 - num2);
//         System.out.println(num1 * num2);
//         System.out.println(num1 % num2);
//     }
//     static void subtraction(){
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         System.out.println(num1 - num2);
//     }
//    static void multi(){
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.println(num1 * num2);
//    }
//    static void div(){
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.println(num1 % num2);
//    }

//---------------------QUESTION 2---------------------------///

//    public static void range(){
//        System.out.println("Please enter a number from 1 to 10");
//        Scanner sc = new Scanner(System.in);
//        int userInput = sc.nextInt();
//
//        if(userInput <= 10 && userInput >= 1){
//            System.out.println("number is within range");
//        }else{
//            System.out.println("number is not within range");
//        }
//    }

//---------------------QUESTION 2.2---------------------------///
//    public static int getInteger(int min, int max) {
//        int userNumber = 0;
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            userNumber = sc.nextInt();
//            if (userNumber >= min && userNumber <= max) {
////                System.out.println("number is within range");
//                break;
//            } else {
//                System.out.println("number is not within range");
//                System.out.print("Enter a number between 1 and 10: ");
//            }
//        }
//        return userNumber;
//    }

    //----------------QUESTION 3---------------------------//
//    public static int getInteger(int min, int max) {
//        int userNumber = 0;
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            userNumber = sc.nextInt();
//            if (userNumber >= min && userNumber <= max) {
//                break;
//            } else {
//                System.out.println("number is not within range");
//                System.out.print("Enter a number between 1 and 10: ");
//            }
//        }
//        for (int i = 1; i <= 5; i++) {
//            userNumber = userNumber * i;
//        }
//        return userNumber;
//    }

//----------------------QUESTION 4----------------------\\

    public static void rollDie(){
        Random r = new Random();

        for(int i = 0; i < 1; i++) {
            int result = r.nextInt(6);
            System.out.println("you rolled a: " + result);
        }
    }

    public static void main (String[] args){

        rollDie();

//--------------------------QUESTION 2.2 & 3---------------------------------
//            System.out.println("Enter a number between 1 and 10");
//            int userInput = getInteger(1, 10);
//            System.out.printf("user number is %d", userInput);

//---------------QUESTION 2 SOLUTION----------------------------//
//        range();

//---------------QUESTION 1 SOLUTION----------------------------//
//        System.out.println("Please enter two numbers\n");
//        addition();
//        System.out.println("Please enter two numbers\n");
//        subtraction();
//        System.out.println("Please enter two numbers\n");
//        multi();
//        System.out.println("Please enter two numbers\n");
//        div();

        }
    }


