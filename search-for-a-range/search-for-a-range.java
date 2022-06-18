class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        int index = -1;
        int left = 0, right = nums.length-1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                index = mid;
                break;
            }
            else if(nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        int index1 = index, index2 = index;
        while(index1-1 >= 0 && nums[index1-1] == target)
            index1--;
        while(index2+1 < nums.length && nums[index2+1] == target)
            index2++;
        return new int[] {index1, index2};
    }
}