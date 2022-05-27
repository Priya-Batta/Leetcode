class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++)
        {
            A[i]=A[i]*A[i];
        }
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]>A[j])
                {
                    int t=A[i];
                    A[i]=A[j];
                    A[j]=t;
                }
            }
        }
        return A;
    }
}