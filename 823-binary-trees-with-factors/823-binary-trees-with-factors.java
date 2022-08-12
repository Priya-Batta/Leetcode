class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        long res = 1, mod = (long)1e9 + 7;
        Arrays.sort(arr);
        long count = 1;
        HashMap<Integer, Long> dp = new HashMap<>();
        dp.put(arr[0], count);
        for(int i=1; i<arr.length; i++) {
            dp.put(arr[i], count);
            for(int j=0; j<i; j++) {
                if(arr[i] % arr[j] == 0) {
                    if(dp.containsKey(arr[i] / arr[j])) {
                        dp.put(arr[i], dp.get(arr[i]) + (dp.get(arr[j]) * dp.get(arr[i] / arr[j])));
                    }
                }
            }
            res = (res + dp.get(arr[i])) % mod;
        }
        return (int)res;
    }
}