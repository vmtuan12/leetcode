package easy;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int numsStartPosition1 = m - 1;
        int numsStartPosition2 = n - 1;
        int resultPosition = m + n - 1;

        while (numsStartPosition2 >= 0) {
            if (numsStartPosition1 >= 0 && nums1[numsStartPosition1] > nums2[numsStartPosition2]) {
                nums1[resultPosition--] = nums1[numsStartPosition1--];
            } else {
                nums1[resultPosition--] = nums2[numsStartPosition2--];
            }
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 10, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 4, nums2, 3);
//        System.out.println(Arrays.toString(nums1));
    }
}
