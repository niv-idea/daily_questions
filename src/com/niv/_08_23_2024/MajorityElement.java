package com.niv._08_23_2024;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        //int largest1=nums.length/2;
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>largest){
                return nums[i];
            }
        }
        return -1;
    }
    //this one is optimized solution
    public static int majorityElement2(int[] nums) {
        int count = 0;
        Integer candidate = null;

        // Phase 1: Find a candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return count > nums.length / 2 ? candidate : -1;
    }
    public static int majorityElement3(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length / 2;

        // Count the occurrences of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the majority element
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > majorityCount) {
                return entry.getKey();
            }
        }

        return -1; // Return -1 if no majority element is found
    }

    public static void main(String[] args) {
        int[] nums={2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

}
