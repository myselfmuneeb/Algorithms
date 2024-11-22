
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }
        return false;
    }

}
