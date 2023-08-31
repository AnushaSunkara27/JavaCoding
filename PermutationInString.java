import java.util.*;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {

        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();

        boolean result = false;

        for(char i: s1.toCharArray()) {
            h1.put(i, h1.getOrDefault(i,0)+1);
        }

        for(int i = 0; i<=s2.length()-s1.length(); i++) {
            String subString = s2.substring(i, i+s1.length());
            for(char j: subString.toCharArray()) {
                h2.put(j, h2.getOrDefault(j,0)+1);
            }
            if(h1.equals(h2)) {
                result = true;
                break;
            } else {
                h2.clear();
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";

        System.out.println(checkInclusion(s1,s2));
    }
}
