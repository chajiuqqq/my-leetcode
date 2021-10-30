package com.chajiu.array;

/**
 * https://leetcode-cn.com/problems/container-with-most-water/
 * 双指针逐步去除不可能的边界。
 */
public class q11 {
    public int maxArea(int[] height) {
        int max=-1;
        int m = height.length;
        int j=0,k=m-1;
        for(int i=0;i<m && j<k;i++){
            int s = (k-j)*Math.min(height[j],height[k]);
            if(max<s){
                max = s;
            }
            if(height[j]<height[k]){
                j++;
            }else{
                k--;
            }
        }
        return max;
    }
}
