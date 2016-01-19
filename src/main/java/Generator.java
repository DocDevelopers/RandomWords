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

    }

    public String generate(){
        return "Afdsfsdf Ddfsdfsdf Cfwsdfedgwerg Adshfsjldf Badsjlfsljdkf Cdflsdfjhsld Alsdfsdlkfj";
    }

    private String generateWord(){
        return null;
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
