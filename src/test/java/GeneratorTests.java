import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Doc on 1/19/16.
 */
public class GeneratorTests {
    char[] pattern = {'A','B','C'};
    Generator mGenerator = new Generator(pattern, 3, false);

    @Test
    public void TestPattern(){
        String sentence = mGenerator.generate();

        String[] words = sentence.split("\\s+");

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

}
