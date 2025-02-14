package org.example.twoPointers;

public class ContainerArea {
    public int maxArea(int[] height) {
        int rightIndex = height.length-1;
        int leftIndex=0;
        int maxWater = 0;

        while(leftIndex < rightIndex){
            int minHeight = Math.min(height[leftIndex],height[rightIndex]);
            int diff = rightIndex -leftIndex;
            maxWater = Math.max(maxWater, minHeight * diff);

            if(height[leftIndex] < height[rightIndex]) leftIndex++;
            else rightIndex--;

        }
        return maxWater;
    }

    public void display(){
        int[] arrHeight = {1,8,6,2,5,4,8,3,7};
        System.out.println("\nmax area of containers is:" + maxArea(arrHeight));
    }
}
