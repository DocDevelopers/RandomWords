import java.util.Random;

/**
 * Created by Doc on 1/19/16.
 */
public class RandomLetter {
    private char randLetter;
    private Random qRandom;

    public RandomLetter(){
        qRandom = new Random();
    }

    public char getRandLetter(){
        return assignLetter();
    }

    private char assignLetter(){
        int number = randNum();
        this.randLetter = (char) number;
        return this.randLetter;
    }

    private int randNum(){
        int maximum = 90;
        int minimum = 65;
        int range = maximum - minimum + 1;
        return qRandom.nextInt(range) + minimum;
    }
}
