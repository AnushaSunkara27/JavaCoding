import java.util.*;

public class ValidPalindrome {
    public boolean isPalindrome(String str) {
        ArrayList<Character> arr = new ArrayList<>();
        
        for(char i: str.toCharArray()) {
            if(Character.isLetterOrDigit(i)) {
                arr.add(Character.toLowerCase(i));
            }
        }
        
        int start = 0;
        int end = arr.size()-1;
        
        while(start <= end) {
            if(arr.get(start) == arr.get(end)) {
                start = start+1;
                end = end-1;
                continue;
            }
            else
                return false;
        }
        
        return true;
    }


    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String str = "A man, a plan, a canal: Panama";

        System.out.println(validPalindrome.isPalindrome(str));
    }
}
