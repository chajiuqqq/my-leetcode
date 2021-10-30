package com.chajiu.array;

/**
 * @link https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 */
public class q4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] res = new int[length];
        int j=0,k=0;
        for (int i = 0; i < length; i++) {

            if(j<nums1.length && k< nums2.length){

                int min;
                if(nums1[j]<=nums2[k]){
                    min = nums1[j];
                    j++;
                }else{
                    min = nums2[k];
                    k++;
                }
                res[i]=min;

            }else if(j == nums1.length){
                res[i]=nums2[k];
                k++;
            }else{
                res[i]=nums1[j];
                j++;
            }
        }

        if(length%2!=0){
            return res[length/2];
        }else{
            int half = length/2;
            return (res[half-1]+res[half])*1.0/2;
        }


    }

    public static void main(String[] args) {

    }
}
