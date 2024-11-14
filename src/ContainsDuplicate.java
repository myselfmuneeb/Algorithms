
import java.util.Hashtable;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] num = new int[(int)Math.pow(10, 5) + 1];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        if(containsDuplicate(num)){
            System.out.println("Duplicate found");
        }else {
            System.out.println("Duplicate not found");
        }

    }
    public static boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length > Math.pow(10, 5) +1 ) return false;
        Map<Integer, Integer> map = new Hashtable<>();

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
