package Neetcode.Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] arr = {7,1,7,2,2,4};
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        int S = 0;

        for (int i = 0; i < n; i++) {
            left[i] = -1;
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            right[i] = n;
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            left[i] += 1;
            right[i] -= 1;
            S = Math.max(S, heights[i] * (right[i] - left[i] + 1));
        }

        return S;
    }

}
