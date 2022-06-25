class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length-1;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(right-left >= k) {
            // System.out.println("start " + left + " " + right);
            if(Math.abs(arr[left]-x) > Math.abs(arr[right]-x))
                left++;
            else
                right--;
            // System.out.println("end " + left + " " + right);
        }
        for(int i=left;i<=right;i++) {
            res.add(arr[i]);
        }
        return res;
    }
}