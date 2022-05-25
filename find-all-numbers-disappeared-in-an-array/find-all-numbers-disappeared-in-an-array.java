class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        Set<Integer> num = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) 
            num.add(nums[i]);
        for(int i=1;i<=nums.length;i++) {
            if(!num.contains(i)) 
                res.add(i);
        }
        return res;
    }
}