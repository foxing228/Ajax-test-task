package task;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringUtils {
    public static char firstNonRepeatingCharacter(String s) {
        if (s.length() < 0 && s.length() > (int) Math.pow(10, 5)) throw new IllegalArgumentException("string length must be greater than 0 and less than 1000000");

        Map<Character,Integer> chars = new LinkedHashMap<>(s.length());
        for (char c : s.toCharArray()) {
            chars.put(c, chars.containsKey(c) ? chars.get(c) + 1 : 1);
        }

        for (Map.Entry<Character,Integer> pairs : chars.entrySet()) {
            if(!IsOkLetter(pairs.getKey())) throw new IllegalArgumentException("string must contain only lowercase English letters");
            if (pairs.getValue() == 1) return pairs.getKey();
            }

        return '_';

    }

    public static boolean IsOkLetter(char c) {
        return (c >= 'a' && c <= 'z');
    }
}
