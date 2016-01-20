import java.util.Random;
import java.util.StringTokenizer;

/**
 * Created by Doc on 1/19/16.
 */
public class WordGenerator {
    private int wordLength;
    private RandomLetter mRandomLetter;
    private Random mRandom;

    public WordGenerator(){
        mRandomLetter = new RandomLetter();
        mRandom = new Random();
    }

    public String generateWord(char startingLetter){
        //Container for result.
        String result = Character.toString(startingLetter);
        //Generate new random word length.
        setRandomWordLength();

        //Build out word
        for(int i = 1; i< this.wordLength; i++){
            char letter = getrandomLetter();
            result += Character.toString(letter);
        }

        return result;
    }

    private int setRandomWordLength(){
        int maximum = 10;
        int minimum = 3;
        int range = maximum - minimum + 1;
        this.wordLength = mRandom.nextInt(range) + minimum;

        return this.wordLength;
    }
    private char getrandomLetter(){
        return mRandomLetter.getRandomLetter();
    }


}
