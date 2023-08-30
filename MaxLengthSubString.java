import java.util.*;

public class MaxLengthSubString {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> characters = new HashSet<>();
        int maxCount = 0;
        int i = 0;
        int j = 0;
        int currentCount = 0;
        while(j< s.length()) {
            if(characters.contains(s.charAt(j))) {
                characters.remove(s.charAt(i));
                i++;
            } else {
                characters.add(s.charAt(j));
                j++;
                currentCount = j-i;
                maxCount = Math.max(currentCount, maxCount);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    
}
