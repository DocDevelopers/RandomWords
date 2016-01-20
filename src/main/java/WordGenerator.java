import java.util.Random;

/**
 * Created by Doc on 1/19/16.
 */
public class WordGenerator {
    private int wordLength;
    private RandomLetter mRandomLetter;
    private Random mRandom;
    private char startingLetter;
    private String newWord;

    public WordGenerator(){
        mRandomLetter = new RandomLetter();
        mRandom = new Random();
    }

    public String generateWord(char mStartingLetter){
        this.startingLetter = mStartingLetter;
        //Empty container for result.
        this.newWord = Character.toString(startingLetter);

        //Generate new random word length.
        setRandNumWordLength();

        //Build out .
        for(int i = 1; i< this.wordLength; i++){
            char letter = randLetter();
           newWord += Character.toString(letter);
        }

        return this.newWord;
    }

    private void setRandNumWordLength(){
        int maximum = 10;
        int minimum = 3;
        int range = maximum - minimum + 1;
        this.wordLength = mRandom.nextInt(range) + minimum;

    }
    private char randLetter(){
        return mRandomLetter.getRandLetter();
    }


}
