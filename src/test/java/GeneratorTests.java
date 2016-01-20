import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Doc on 1/19/16.
 */
public class GeneratorTests {


    @Test
    public void TestPatternUnSorted(){
        char[] pattern = {'B','U','L','L'};
        Generator mGenerator = new Generator(pattern, 100, false);
        String sentence = mGenerator.generate();

        String[] words = sentence.split(", ");

        char[] firstLetters = new char[words.length];

        //Get the first letters from the sentence.
        for(int i = 0; i<words.length; i++){
            char firstLetter = words[i].charAt(0);
            firstLetters[i] = firstLetter;

        }

        int patternIndex = 0;

        for(int i = 0; i<firstLetters.length; i++){
            assertEquals("Pattern did not match", firstLetters[i], pattern[patternIndex]);
            if(patternIndex == pattern.length - 1)
                patternIndex = 0;
            else
                patternIndex++;
        }

    }

    @Test
    public void isAlphabetical(){
        char[] pattern = {'B','U','L','L'};
        Generator mGenerator = new Generator(pattern, 100, true);
        String sentence = mGenerator.generate();

        String[] words = sentence.split(", ");

        for(int i = 0; i< words.length-1; i++){

            assertTrue("Your string is not in alphabetical order!",words[i].compareTo(words[i+1]) <= 0 );


        }
    }

}
