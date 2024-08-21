class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> resultList = new ArrayList<>();
        if (nums.length == 0) return resultList;

        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] - nums[i - 1] != 1) {
                if (start == nums[i - 1]) {
                    resultList.add(String.valueOf(start));
                } else {
                    resultList.add(start + "->" + nums[i - 1]);
                }

                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return resultList;
    }
}