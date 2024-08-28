class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        
        int result = 0;
        
        while (s.charAt(i) == ' ') {
            i -= 1;
        }
        
        while (i >= 0 && s.charAt(i) != ' ') {
            result += 1;
            i -= 1;
        }
        
        return result;
    }
}