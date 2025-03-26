package Neetcode.Stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    public static void main(String[] args) {
        int[] pos = {10,8,0,5,3};
        int[] spd = {2,4,1,1,3};
        System.out.println(carFleet(12,pos,spd));

    }
    public static int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = speed[i];
            pair[i][1] = position[i];
        }

        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();

        for (int[] p : pair) {
            stack.push((double) (target - p[0]) / p[1]);
            if (stack.size() >= 2 &&
                    stack.peek() <= stack.get(stack.size() - 2))
            {
                stack.pop();
            }
        }



        return stack.size();
    }
}
