class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b-a));
        for(int i=matrix.length-1; i>=0; i--) {
            for(int j=matrix.length-1; j>=0; j--) {
                pq.offer(matrix[i][j]);
                if(pq.size() > k)
                    pq.poll();
            }
        }
        return (pq.peek());
    }
}