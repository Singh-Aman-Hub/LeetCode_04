class Solution {
public:
    bool canPartitionGrid(vector<vector<int>>& grid) {
       long unsigned int totalSum=0;
        long unsigned int row=grid.size();
        long unsigned int col=grid[0].size();

        for(long unsigned int i=0;i<row;i++){
            for(long unsigned int j=0;j<col;j++){
                totalSum+= grid[i][j];
            }
        }
        if(totalSum%2==1){
            return false;
        }
        long unsigned int half=0;
        for(long unsigned int i=0;i<row-1;i++){
            for(long unsigned int j=0;j<col;j++){
                half+= grid[i][j];
            }
            if(half==totalSum/2){
                // cout<<half<<" "<<totalSum<<endl;
                return true;
                
            }
        }
        // cout<<half<<" "<<totalSum<<endl;
        half=0;
        for(long unsigned int i=0;i<col-1;i++){
            for(long unsigned int j=0;j<row;j++){
                half+= grid[j][i];
            }
            if(half==totalSum/2){
                return true;
            }
        }
        return false;
        
        
    }
};