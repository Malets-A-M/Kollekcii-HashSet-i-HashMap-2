import java.util.Arrays;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }
    public boolean hasWord(String word){
        String[] words = text.split("\\P{IsAlphabetic}+");
    return Arrays.asList(words).contains(word);
    }
    public void printText(){
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (String word : words){
            System.out.println(word);
        }
    }
}
