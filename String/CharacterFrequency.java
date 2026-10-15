import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static Map<Character, Integer> countCharacters(String s) {
        Map<Character, Integer> frequency = new HashMap<>();

        if (s == null) {
            return frequency;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            frequency.put(
                c,
                frequency.getOrDefault(c, 0) + 1
            );
        }

        return frequency;
    }

    public static void main(String[] args) {
        System.out.println(countCharacters("banana"));
    }
}
