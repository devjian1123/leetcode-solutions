class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        if (nums.length == 1) return nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            int n = map.getOrDefault(nums[i], 0) + 1;
            
            if (n > (nums.length / 2)) {
                return nums[i];
            }
            
            map.put(nums[i], n);
        }
        
        return 0;
    }
}