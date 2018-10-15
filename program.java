
package javaapplication1;
 import java.util.Random; 
/**
 *
 * @author dave
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        
        int turns = 26;
        String[] wordlist = {"jazz", "awesome", "dice"};
        Random rand = new Random(); 
        String word = wordlist[rand.nextInt(wordlist.length)];
        
        System.out.println(word);
        
    }
    
}
