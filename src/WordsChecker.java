import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String text;
    private Set<String> set = new HashSet<>();
    private String[] words = text.split("\\P{IsAlphabetic}+");


    public WordsChecker(String text) {
        this.text = text;
    }
    public boolean hasWord(String word){
        set.addAll(List.of(words));
        return set.contains(word);
    }
    public void printText(){
        for (String word : words){
            System.out.println(word);
        }
    }
}
