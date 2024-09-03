class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String base = strs[0];
        int baseLength = base.length();
        
        for (int i = 0; i < baseLength; i++) {
            char currentChar = base.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return base.substring(0, i);
                }
            }
        }
        
        return base;
    }
}
