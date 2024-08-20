class Solution {
    public int removeElement(int[] nums, int val) {
        int [] tempArr = new int[nums.length];
        
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tempArr[j] = nums[i];
                j++;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = tempArr[i];
        }
        
        return j;
    }
}