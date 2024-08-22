class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                nums[pointer] = nums[i];
                pointer++;
            } 
        }
        
        return pointer;
    }
}