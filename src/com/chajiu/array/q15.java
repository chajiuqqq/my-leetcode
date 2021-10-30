package com.chajiu.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/3sum/
 */
public class q15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for (int i = 0; i < n-2; i++) {
            if(nums[i]>0){
                return list;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int L=i+1,R=n-1;
            while(L<R){
                int s = nums[i] + nums[L] + nums[R];
                if(s ==0){
                    ArrayList<Integer> item = new ArrayList<>();
                    item.addAll(Arrays.asList(nums[i],nums[L],nums[R]));
                    list.add(item);
                    while( L<R && nums[L] == nums[L+1]){
                        L++;
                    }
                    while( L<R && nums[R] == nums[R-1]){
                        R--;
                    }
                    L++;
                    R--;
                }else if(s>0){
                    R--;
                }else if(s<0){
                    L++;
                }
            }

        }

        return list;



    }
}
