package com.niv._08_23_2024;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static int removeDuplicates1(int[] nums) {
        if (nums.length == 0)
            return 0;

        int index = 1; // Start from the second element
        int count = 1; // Count  current element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) { //it will check next to back
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[index] = nums[i];
                index ++;
            }
        }

        return index;
    }
    //by using the set interface
    public static int removeDuplicates3(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        Set<Integer> set = new HashSet<>();
        int index = 0;

        for (int num : nums) {
            if (set.add(num)) {
                nums[index++] = num;
            }
        }

        return index;
    }
    //optimize solution two pointer approach
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;
        int index = 2; // Start from the third element

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args){
        int[] nums={1,1,1,2,2,3};
        int newLength = removeDuplicates(nums);


        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
