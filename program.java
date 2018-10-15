
package javaapplication1;
 import java.util.Random; 
import java.util.Scanner; 

public class JavaApplication1 {

    public static void main(String[] args) {
        
        int turns = 26;
        String[] wordlist = {"jazz", "awesome", "dice"};
        Random rand = new Random(); 
        String word = wordlist[rand.nextInt(wordlist.length)];
        
        System.out.println(word);
        
        boolean guessed = false;
        Scanner scan = new Scanner(System.in); 
        while (! guessed && turns > 0){
            char c = scan.next().charAt(0); 
            if (word.contains(String.valueOf(c))){
                System.out.println("the letter " + c + " is there!");
            }
            else{
                System.out.println( "u suck");
            }
            turns--;
        }
        System.out.println("Oh damn! You're out of guesses");
    }

}
