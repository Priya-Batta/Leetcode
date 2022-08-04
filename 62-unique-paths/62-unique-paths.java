class Solution {
    public int uniquePaths(int m, int n) {
        int total = m + n - 2;
        int k = m-1;
        long res = 1;
        for(int i=1; i<=k; i++) {
            res = res * (total-k+i) / i;
        }
        return (int)res;
    }
}