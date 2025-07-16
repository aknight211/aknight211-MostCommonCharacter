import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for(char i : str.toCharArray()){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        char common = str.charAt(0);
        int maxCount = 0;

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                common = entry.getKey();
            }
        }
        return common;
    }
}
