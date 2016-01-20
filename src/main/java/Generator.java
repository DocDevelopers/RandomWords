import com.sun.tools.javac.util.StringUtils;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Doc on 1/19/16.
 */
public class Generator {
    private boolean isSorted;
    private char[] pattern;
    private int wordCount;
    private ArrayList<String> sentence;
    private WordGenerator mWordGenerator;


    public Generator(char[] mPattern, int mWordCount, boolean mIsSorted){
        this.isSorted = mIsSorted;
        this.pattern = mPattern;
        this.wordCount = mWordCount;
        this.mWordGenerator = new WordGenerator();

    }

    public static void main(String[] args){
        char[] pattern = {'B','U','L','L'};
        Generator mGen = new Generator(pattern,10000, false);
        System.out.println(mGen.generate());

    }

    public String generate(){
        sentence = new ArrayList<String>();
        int patternIndex = 0;
        //Loop for generating x amount of words
        for(int i = 0; i< this.wordCount; i++){
            //System.out.println("Iteration: "+ i);
            sentence.add(generateWord(pattern[patternIndex]));
            if(patternIndex < pattern.length - 1)
                patternIndex++;
            else
                patternIndex = 0;
        }

        if(isSorted)
            java.util.Collections.sort(sentence);

        String result = sentence.toString();
        result = result.substring(1);
        result = result.substring(0,result.length()-1);

        return result;
    }


    private String generateWord(char startingLetter){
        return mWordGenerator.generateWord(startingLetter);
    }

    private void sortList(){

    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public void setSorted(boolean sorted) {
        isSorted = sorted;
    }

    public void setPattern(char[] pattern) {
        this.pattern = pattern;
    }
}
