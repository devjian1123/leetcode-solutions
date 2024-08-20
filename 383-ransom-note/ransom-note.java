class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            Integer remain = map.getOrDefault(c, 0);
            
            if (remain < 1) {
                return false;
            } else {
                remain--;
                map.put(c, remain);
            }
        }
        
        return true;
    }
}