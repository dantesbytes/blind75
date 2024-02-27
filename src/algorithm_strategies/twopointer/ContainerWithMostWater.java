package algorithm_strategies.twopointer;

public class ContainerWithMostWater {

    public static void main(String[] args) {


    }

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length -1;
        int maxArea = 0;

        while (left <right) {

            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public int maxArea2(int[] height) {

        int left = 0;
        int right = height.length-1;
        int maxarea = 0;

        while (left < right) {

            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxarea = Math.max(maxarea,currentArea);

            if(height[left] <height[right]) {
                left++;
            } else {
                right--;

            }
        }

        return maxarea;
    }
}
