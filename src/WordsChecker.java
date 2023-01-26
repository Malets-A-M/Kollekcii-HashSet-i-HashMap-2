import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }
    public boolean hasWord(String word){
        Set<String> set = new HashSet<>();
        String[] words = text.split("\\P{IsAlphabetic}+");
        set.addAll(List.of(words));
        return set.contains(word);
//    return Arrays.asList(words).contains(word);
    }
    public void printText(){
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (String word : words){
            System.out.println(word);
        }
    }
}
