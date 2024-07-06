package java;
// https://leetcode.com/problems/insert-delete-getrandom-o1/?envType=daily-question&envId=2024-01-16

class RandomizedSet {

    public HashSet<Integer> hs ;
    public Random r ;

    public RandomizedSet() {
        hs = new HashSet<>(); 
        r = new Random();
    }

    public boolean insert(int val) {
        if (hs.contains(val)){
            return false;
        } 
        hs.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!hs.contains(val)) {
            return false;
        } 
        hs.remove(val);
        return true;
    }
    
    public int getRandom() {
        Integer[] arr = hs.toArray(new Integer[hs.size()]);
        return arr[r.nextInt(hs.size())];    
    }
 
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */