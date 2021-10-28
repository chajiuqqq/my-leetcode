package com.chajiu.array;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @link https://leetcode-cn.com/problems/two-sum/
 * 一般思路是遍历nums，选择两个相加进行判断，时间复杂度是O(n^2)
 * --》n-1次、n-2次。。。1次，累加就是n^2
 *
 * 降低时间复杂度的方法是，进行一次遍历。每次遍历时，现寻找map中是否存在target-nums[i]的元素记录，找到了就退出；
 * 没有找到就在map中存入当前元素及其下标，供之后元素寻找。
 * 时间复杂度为O(n)
 */
public class q1 {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(;i<nums.length;i++){
            int subVal =  target-nums[i];
            Integer index = map.get(subVal);
            if(index == null){
                map.put(nums[i],i);
            }else{
                j=index;
                break;
            }
        }
        return new int[]{i,j};



    }

    public static void main(String[] args) {
        int[] nums = {3,2,5};
        twoSum(nums,10);
    }
}
