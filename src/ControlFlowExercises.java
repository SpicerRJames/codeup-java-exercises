import java.util.*;
public class ControlFlowExercises {
    public static void  main (String[] arg){

//        int i = 0;
//        while(i < 15){
//           System.out.println(i);
//            i++;
//        }

//        do {
//            i = (2 + i) * 2;
//            System.out.println(i);
//        }while (i < 100);

//        int i = 100;
//        do {
//            i = i-5;
//            System.out.println(i);
//        }while (i>=-10);

//        float i = 2;

//        do{
////            String str = String.format("%.0f", i);
////            i * i;
////            System.out.printf(str);
////        }while(2 > 1000000);

//        int num = 35;
//        for (int i = 1; i <= num; i++)
//        {
//            if (((i % 5) == 0) && ((i % 7) == 0)) // Is it a multiple of 5 & 7?
//                System.out.println("fizzbuzz");
//            else if ((i % 5) == 0) // Is it a multiple of 5?
//                System.out.println("fizz");
//            else if ((i % 7) == 0) // Is it a multiple of 7?
//                System.out.println("buzz");
//            else
//                System.out.println(i); // Not a multiple of 5 or 7
//        }

        // Create a new scanner
        Scanner number = new Scanner(System.in);
        // Create a new
        //make new input for user
        System.out.println("Enter a number to be squared and cubed");
        int calculateNumber = number.nextInt();

        for (int i = 0; i <= 5; i++){

        }

        System.out.println("Number | Squared | Cubed");
        System.out.println("------ | ------- | ------");
        System.out.println(calculateNumber + "      |" +  "      |");


    }
}
