import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String text;
    private Set<String> set = new HashSet<>();
    private String[] words;


    public WordsChecker(String text) {
        this.text = text;
        words = text.split("\\P{IsAlphabetic}+");
        set.addAll(List.of(words));
    }
    public boolean hasWord(String word){
        return set.contains(word);
    }
    public void printText(){
        for (String word : words){
            System.out.println(word);
        }
    }
}
