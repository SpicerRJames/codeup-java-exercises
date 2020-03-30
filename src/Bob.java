import java.util.Scanner;
public class Bob {
    public static void main (String[] args){

        System.out.println("\nAsk Bob a question");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        char var1 = userInput.charAt(userInput.length() -1);

//        if(userInput.endsWith("!")){
//            System.out.println("Yo! Stop yelling at me!");
//        }else if(userInput.endsWith("?")){
//            System.out.println("Sure");
//        }else if(userInput.endsWith(".")){
//            System.out.println("Whatever");

        switch (var1){
            case '?':
                System.out.println("Sure");
                break;
            case '!':
                System.out.println("Yo! Stop yelling at me!");
                break;
            default:
                System.out.println("Whatever");
        }
        }
    }

