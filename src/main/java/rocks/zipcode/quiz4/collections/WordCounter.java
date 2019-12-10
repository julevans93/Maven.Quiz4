package rocks.zipcode.quiz4.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private String[] strings;

    public WordCounter(String... strings) {
        this.strings=strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Integer counter = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings){
            counter++;
            map.put(str, counter);
        }
        return map;
    }
}
