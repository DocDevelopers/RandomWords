import java.util.Random;

/**
 * Created by Doc on 1/19/16.
 */
public class RandomLetter {
    private char randLetter;
    private Random mRandom;

    public RandomLetter(){
        mRandom = new Random();
    }

    public char getRandomLetter(){
        return assignLetter();
    }

    private char assignLetter(){
        int number = randomNum();
        this.randLetter = (char) number;
        return this.randLetter;
    }

    private int randomNum(){
        int maximum = 90;
        int minimum = 65;
        int range = maximum - minimum + 1;
        return mRandom.nextInt(range) + minimum;
    }
}
