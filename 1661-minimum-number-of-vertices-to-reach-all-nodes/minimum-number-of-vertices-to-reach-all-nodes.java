class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans= new ArrayList<>();
        int edge[]= new int[n];
        for(List<Integer> list: edges){
            edge[list.get(1)]++;
        }
        for(int i=0;i<n;i++){
            if(edge[i]==0)ans.add(i);
        }
        return ans;
    }
}