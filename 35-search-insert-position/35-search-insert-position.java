class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left <= right) {
            if(nums[left + (right-left) / 2] == target) {
                return (left + (right-left) / 2);
            }
            else if(nums[left + (right-left) / 2] < target) 
                left = (left + (right-left) / 2) + 1;
            else 
                right = (left + (right-left) / 2) - 1;
        }
        return left;
    }
}