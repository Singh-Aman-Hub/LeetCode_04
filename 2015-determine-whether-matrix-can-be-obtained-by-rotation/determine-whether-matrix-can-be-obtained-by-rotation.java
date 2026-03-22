class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n= target.length;
        boolean first= true;
        boolean second = true;
        boolean third= true;
        boolean fourth= true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (mat[i][j]== target[j][n-i-1]  ){
                    
                }else if(first){
                    first= !first;
                }

                if(mat[i][j]== target[n-i-1][n-j-1]){

                }else if(second){
                    // System.out.println(mat[i][j]+" "+target[n-i-1][n-j-1]);
                    second= !second;
                }

                if(mat[i][j]== target[i][j]){

                }else if(fourth){
                    // System.out.println(mat[i][j]+" "+target[n-i-1][n-j-1]);
                    fourth= !fourth;
                }
                if(mat[i][j]== target[n-j-1][i]){

                }else if(third){
                    // System.out.println(mat[i][j]+" "+target[n-i-1][n-j-1]);
                    third= !third;
                }
                
            }
        }
        return first|| second|| third || fourth;
    }
}