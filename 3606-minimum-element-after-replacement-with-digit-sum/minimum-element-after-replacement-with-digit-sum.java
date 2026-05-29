class Solution {
    public int sumNum(int n){
        int ans=0;
        while(n!=0){
            ans+= n%10;
            n/=10;
        }
        return ans;
    }
    public int minElement(int[] nums) {
        int mini= Integer.MAX_VALUE;
        for(int ele: nums){
            int currSum= sumNum(ele);
            mini= Math.min(currSum, mini);
        }
        return mini;

    }
}