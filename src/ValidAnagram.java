import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("aaba" , "aabb"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        for (char d : t.toCharArray()) {
            if (!sMap.containsKey(d)) return false;
            sMap.put(d, sMap.get(d) - 1);
        }
        for (char key : sMap.keySet()) {
            if (sMap.get(key) != 0) return false;
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

}
