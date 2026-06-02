class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        

        int global=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterDuration.length;j++){

                int diff1 = waterStartTime[j] - (landStartTime[i]+landDuration[i] );

                int diff2 = landStartTime[i] -(waterStartTime[j]+waterDuration[j]) ;

                if(diff1<0)diff1= 0;
                if(diff2<0)diff2= 0;

                global= Math.min(landStartTime[i]+landDuration[i]+ diff1 + waterDuration[j], global);

                global= Math.min(diff2+landDuration[i]+ waterStartTime[j] + waterDuration[j], global);





            }
            
        }
        return global;
    }
}