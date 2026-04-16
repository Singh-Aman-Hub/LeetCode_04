class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int degree[]= new int[n];
        for(int[] edge: roads){
            degree[edge[0]]++;
            degree[edge[1]]++;
        }
        Arrays.sort(degree);
        long  ans=0;
        long i=1;
        for(int val: degree){
            ans+= val*(i++);
        }
        return ans;
    }
}