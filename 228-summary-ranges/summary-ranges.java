class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> resultList = new ArrayList<>();
        
        if (nums.length == 0) return resultList;
        
        if (nums.length == 1) {
            resultList.add("" + nums[0]);
            return resultList;
        } 
        
        int start = nums[0];
        int end = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == 1) {
                end = nums[i];
                
                if (i + 1 == nums.length) {
                    resultList.add(start + "->" + end);
                }
            } else {
                String result = "";
                if (end > start) {
                    result = start + "->" + end;
                } else {
                    result = String.valueOf(start);
                }
                
                resultList.add(result);
                start = nums[i];
                    
                if (i + 1 == nums.length) {
                    resultList.add(String.valueOf(nums[i]));
                }
            }
        }
        
        return resultList;
    }
}