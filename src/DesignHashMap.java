public class DesignHashMap {

    private static final int LIMIT = (int)Math.pow(10,6) + 1;
    private final int [] Map;

        public DesignHashMap() {
            Map = new int[LIMIT];
        }

        public void put(int key, int value) {
            Map[key] = value;
        }

        public int get(int key) {
            return Map[key] == 0 ? -1 : Map[key];
        }

        public void remove(int key) {
            Map[key] = -1;
        }

}
//
//class MyHashMap {
//    private final int limit = (int)Math.pow(10, 6) + 1;
//    private final int map[];
//    public MyHashMap() {
//        this.map = new int[limit];
//        Arrays.fill(map, -1);
//    }
//
//    public void put(int key, int value) {
//        this.map[key] = value;
//    }
//
//    public int get(int key) {
//        return this.map[key];
//    }
//
//    public void remove(int key) {
//        this.map[key] = -1;
//    }
//
//}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
