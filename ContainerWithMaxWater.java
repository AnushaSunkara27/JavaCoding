public class ContainerWithMaxWater {

    public static int calculateMaxArea(int[] height) {
        int maxArea = 0;

        if(height == null || height.length == 0) {
            return maxArea;
        }

        int left = 0;
        int right = height.length -1;

        while(left < right) {
            int currentHeight = Math.min(height[left], height[right]);
            int currentWidth = right-left;
            int area = currentHeight * currentWidth;

            maxArea = Math.max(area, maxArea);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;

    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println("max area is  "+ calculateMaxArea(arr));
    }
    
}
