import java.util.Arrays;

public class DesignHashSet {
    public static void main(String[] args) {

    }
}
class MyHashSet {

    private static final int LIMIT = (int)Math.pow(10,6) + 1;
    private final int[] set ;
    int iterator =  0;

    public MyHashSet() {
        set = new int[LIMIT];
        Arrays.fill(set, -1);
    }

    public void add(int key) {
        set[key] = key;
    }

    public void remove(int key) {
        set[key] = -1;
    }

    public boolean contains(int key) {
        return set[key] != -1;
    }
}


