import java.util.HashMap;
import java.util.Map;

public class IsTwoStringArePermutations {

    public static void main(String[] args) {
        System.out.println(isPermutation("abba", "baab"));
    }
        public static boolean isPermutation(String s1, String s2) {
            if (s1 == null || s2 == null) return false;
            if (s1.length() != s2.length()) return false;

            Map<Character, Integer> charCount = new HashMap<>();

            // Count s1
            for (char c : s1.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            // Subtract with s2 and early-exit if any goes negative
            for (char c : s2.toCharArray()) {
                Integer cnt = charCount.get(c);
                if (cnt == null || cnt == 0) return false;
                charCount.put(c, cnt - 1);
            }


            for (int v : charCount.values()) if (v != 0) return false;
            return true;
        }
}