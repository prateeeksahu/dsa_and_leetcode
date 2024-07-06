// https://leetcode.com/problems/minimum-common-value/description/

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;

        if (nums1[nums1.length - 1] < nums2[0] || nums2[nums2.length - 1] < nums1[0]) return -1;

        while (i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) i++;
            else if(nums2[j] < nums1[i]) j++;
            else return nums2[j];
        }

        return -1;
    }
}
