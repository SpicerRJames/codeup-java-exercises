import java.util.Arrays;
import java.util.Random;
public class ServerNameGenerator{
    public static String[] nouns = {"Bird", "Dog", "Gryphon", "Cat", "Bat", "Sloth", "Dragon", "Lizard", "Kobald", "Unicorn"};
    public static String[] adj = {"Angry", "Big", "Jolly", "Fancy", "Lazy", "Brave", "Sad", "Clumsy", "Dizzy", "Tipsy"};

    public static String serverName(String[] choices){
        Random rand = new Random();
        String randWord = choices[rand.nextInt(choices.length)];
        return randWord;
    }

    public static void main (String[] args){
        System.out.println("\t" + serverName(adj) + "-" + serverName(nouns));
    }
}

