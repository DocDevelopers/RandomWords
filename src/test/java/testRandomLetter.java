/**
 * Created by simonhamermesh on 1/19/16.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class testRandomLetter {

    RandomLetter rand1 = new RandomLetter();

    char result = rand1.getRandLetter();



    @Test
    public void RandomLetter(){

        assertTrue(Character.isLetter(result));

    }

}
