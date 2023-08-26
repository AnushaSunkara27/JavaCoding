public class TwoSum {

    public int[] calculateTwoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int length = numbers.length;

        int left = 0;
        int right = length-1;

        while(left<right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                result[0] = left+1;
                result[1] = right+1;
                return result;
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] numbers = {2,3,4};
        int[] result =obj.calculateTwoSum(numbers, 6);

        for(int i:result) {
            System.out.println(i);
        }
    }
}
