class Solution {
    public int findCenter(int[][] edges) {
        int n= edges.length;
        int [] count= new int[1_000_008];
        for(int [] vertex: edges){
            count[vertex[0]]++;
            count[vertex[1]]++;
        }
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(count[i]==n)return i;
        }
        return -1;

    }
}