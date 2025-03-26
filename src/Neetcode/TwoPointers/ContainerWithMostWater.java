package Neetcode.TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args){
        int[] heights = {1,7,2,5,4,7,3,6};
        System.out.println(maxAmount(heights));
    }

    public static int maxAmount(int[] heights) {
        int maxWater = 0;  // Переменная для хранения максимального объема воды
        int left = 0;       // Левый указатель
        int right = heights.length - 1;  // Правый указатель

        while (left < right) {
            // Вычисляем объем воды, который можно удержать между двумя указателями
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int area = height * width;
            maxWater = Math.max(maxWater, area);

            // Двигаем указатели внутрь, уменьшая ширину, но пытаясь найти большую высоту
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
