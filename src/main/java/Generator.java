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
    private int patternIndex = 0;

    public Generator(char[] mPattern, int mWordCount, boolean mIsSorted){
        this.isSorted = mIsSorted;
        this.pattern = mPattern;
        this.wordCount = mWordCount;
        this.mWordGenerator = new WordGenerator();

    }

    public static void main(String[] args){
        char[] pattern = {'B','U','L','L'};
        Generator mGen = new Generator(pattern,1000000, true);
        mGen.generate();

    }

    public String generate(){
        sentence = new ArrayList<String>();
        //Loop for generating x amount of words
        for(int i = 0; i< this.wordCount; i++){
            //System.out.println("Iteration: "+ i);
            sentence.add(generateWord(pattern[patternIndex]));
            if(patternIndex < pattern.length - 1)
                patternIndex++;
            else
                patternIndex = 0;
        }
        return buildString(sentence);
    }

    private String buildString(ArrayList<String> sentence){
        String result = "";
        if(isSorted)
            java.util.Collections.sort(sentence);
            //return sentence.toString();
        //Build the raw string based on list.
        for(String word : sentence){

        }


        try{
            long start = System.nanoTime();
            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/Doc/Desktop/million.txt"));
            bw.write(sentence.toString());
            bw.close();
            long time = System.nanoTime() - start;
            System.out.println("Wrote " + result.length()*1000L/time+" MB/s.");
        }catch (FileNotFoundException e){

        }catch (IOException e){

        }


        return sentence.toString();
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
