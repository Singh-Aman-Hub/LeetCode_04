class Solution {
    public int findJudge(int n, int[][] trust) {
        // if(n==1)return n;
        int [] count= new int[n+1];
        for(int [] vertex: trust){
            count[vertex[0]]--;
            count[vertex[1]]++;
        }
        for(int i=1;i<n+1;i++){
            if(count[i]==n-1)return i;
        }
        return -1;

    }
}