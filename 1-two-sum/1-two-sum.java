class Solution {
    public int[] twoSum(int[] nums, int target) {
        //build hashmap -> O(n) to build hashmap and O(n) -> to walkthorugh array and get elements
        // from hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j=0; j < nums.length; j++){
            int diff = target-nums[j];
            if(map.containsKey(diff)){
                int[] res = new int[]{map.get(diff), j};
                return res;
            }
            map.put(nums[j],j);
        }
        return null; 
    }
}