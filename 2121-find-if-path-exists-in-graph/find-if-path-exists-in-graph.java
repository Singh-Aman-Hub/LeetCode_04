class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int edge[]: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean visited[]= new boolean[n];
        return dfs(graph, visited, source, destination);
    }
    public boolean dfs(List<List<Integer>> graph, boolean[] visited, int curr, int d){
        if(curr==d){
            return true;
        }
        visited[curr]= true;
        for(int neighbor: graph.get(curr)){
            if(visited[neighbor]==false){
                if( dfs(graph, visited, neighbor, d))return true;
            }
        }
        return false;
    }
}