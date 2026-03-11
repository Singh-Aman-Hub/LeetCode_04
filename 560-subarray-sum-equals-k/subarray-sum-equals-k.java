class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(sum==k)ans++;
                sum+= nums[j];
            }
            if(sum==k)ans++;
            
        }
        return ans;
    }
}