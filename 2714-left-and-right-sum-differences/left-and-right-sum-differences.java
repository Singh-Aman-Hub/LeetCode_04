class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left=0;
        int right= 0;
        int ans[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=left;
            left+=nums[i]; 
        }

        for(int i= nums.length-1;i>=0;i--){
            ans[i]= Math.abs(ans[i]- right);
            right+= nums[i];
        }
        return ans;
    }
}