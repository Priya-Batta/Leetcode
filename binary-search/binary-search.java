class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<=right) {
            if(nums[(left+right) / 2] == target) 
                return (left+right) / 2;
            else if(nums[(left+right) / 2] < target) 
                left = ((left+right) / 2) + 1;
            else 
                right = ((left+right) / 2) - 1;
        }
        return -1;
    }
}