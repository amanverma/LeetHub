class Solution {
    HashMap<Integer, Integer> cache = new HashMap<>();
    Solution(){
        cache.put(0,0);
        cache.put(1,1);
        cache.put(2,1);
    }
    public int tribonacci(int n) {
        if(n<=0) return 0;
        if(cache.containsKey(n)) {
            return cache.get(n);
        }
        int val = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        cache.put(n, val);
        return val;
        
    }
}