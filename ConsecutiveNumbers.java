import java.util.HashSet;
import java.util.Set;

public class ConsecutiveNumbers {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int maxLength = 0;
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) {
            numSet.add(num);
        }


        for(int num:numSet) {
            if(!numSet.contains(num-1)) {
                int currentStreak = 1;
                int currentNum = num;

                while(numSet.contains(currentNum+1)) {
                    currentStreak++;
                    currentNum++;
                }

                maxLength = Math.max(maxLength, currentStreak);
            }
        }

        return maxLength;
    }


    public static void main(String[] args) {
        ConsecutiveNumbers consecutiveNumbers = new ConsecutiveNumbers();
        int[] nums1 = {100,2,3,1};
        System.out.println(consecutiveNumbers.longestConsecutive(nums1));
    }
}