import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int currentValue = romanMap.get(s.charAt(i));
            if (i < n - 1) {
                int nextValue = romanMap.get(s.charAt(i + 1));
                if (currentValue < nextValue) {
                    result += (nextValue - currentValue);
                    i++;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }
        return result;
    }
}