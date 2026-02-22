class Solution {
    public int binaryGap(int n) {
        String bin= Integer.toBinaryString(n);
        int max=0;
        int temp=0;
        boolean start= false;
        for(char c: bin.toCharArray()){
            if(c=='1'){
                if(!start){
                    start=!start;
                    continue;
                    
                }else{
                    max= Math.max(temp+1, max);
                    temp=0;
                }
                
            }
            if(c=='0' && start)temp++;
            
        }
        return max;
    }
}