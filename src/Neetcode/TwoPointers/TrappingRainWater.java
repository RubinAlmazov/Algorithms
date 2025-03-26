//TODO: havent solved it, back to this task

package Neetcode.TwoPointers;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,2,0,3,1,0,1,3,2,1};
        System.out.println(trap(arr));

    }

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int amount = 0;
        int left = 0;
        int right = height.length-1;
        int leftMax = height[left], rightMax = height[right];

        while (left < right) {

            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                amount += leftMax - height[left];
            }
            else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                amount += rightMax - height[right];
            }
        }

        return amount;

    }
}
