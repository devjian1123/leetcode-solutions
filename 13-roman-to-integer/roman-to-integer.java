class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanToNumberMap = new HashMap<>();
        romanToNumberMap.put('I', 1);
        romanToNumberMap.put('V', 5);
        romanToNumberMap.put('X', 10);
        romanToNumberMap.put('L', 50);
        romanToNumberMap.put('C', 100);
        romanToNumberMap.put('D', 500);
        romanToNumberMap.put('M', 1000);
        
        int result = 0;
        
        for (int i = s.length() - 1; i > -1; i--) {
            int number = romanToNumberMap.get(s.charAt(i));
            
            if (4 * number < result) {
                result = result - number;
            } else {
                result += number;
            }
        }
        
        return result;
    }
}