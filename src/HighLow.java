import java.util.Random;
import java.util.Scanner;

public class HighLow {
    //! THIS IS HOW U DECLARE A SCANNER GLOBALLY
//    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(playGame());
    }

    private static boolean playGame() {
    }
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
    public static int promtNumber() {
        int guess;

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess which number I'm thinking of?");

        while (true) {
            guess = scan.nextInt();
            if (guess > 0 && guess <= 100) break;
            System.out.println("Please enter a number between 0-101");
        }
        return guess;
    }
}