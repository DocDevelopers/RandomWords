/**
 * Created by simonhamermesh on 1/20/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;


public class testWordGenerator {

    WordGenerator wordGen1 = new WordGenerator();
    char letter = 'A';
    String newWord = wordGen1.generateWord(letter);


    @Test
    public void testWordGenerator_generateword_wordlength() {

        // Check to see if word length is between 3-10 characters.
        assertTrue(newWord.length() >= 3 && newWord.length() <= 10);
    }

     @Test
     public void testWordGenerator_generateword_wordisletters(){

            // Check to see if each letter in word is a letter.
            for (int i = 0; i < newWord.length() - 1; i++) {
                assertTrue(Character.isLetter(newWord.charAt(i)));
            }
        }

    @Test
    public void testWordGenerator_generateword_letterisinpattern() {

        // Check to see if the starting letter of the word is present in the input pattern given.

       assertTrue(newWord.charAt(0)== letter);
    }

}


