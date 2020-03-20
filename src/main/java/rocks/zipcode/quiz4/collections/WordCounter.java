package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

    private List<String> words = new ArrayList<>();
    public WordCounter(String... strings) {
        for(String s : strings){
            words.add(s);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> output = new HashMap<>();
        for(String s: words){
            if (output.containsKey(s))
                output.put(s, output.get(s)+1);
            else
                output.put(s, 1);
        }
        return output;
    }
}
