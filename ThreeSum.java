import java.util.*;
public class ThreeSum {

    // Implement 3Sum using TwoSum approach
    public static List<List<Integer>> Calculate3Sum(int[] arr) {
        
        if(arr == null || arr.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        for(int i=0; i< arr.length-2; i++) {

            int left = i+1;
            int right = arr.length - 1;
            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[left]);
                    list.add(arr[right]);
                    result.add(list);
                    left++;
                    right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    return new ArrayList<>(result);
    }


    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = Calculate3Sum(arr);

        for(List i: result) {
            System.out.println(i);
        }
    }
}
