class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans = Math. max(cnt,ans);
                cnt=0;
            }else{
                cnt++;
            }

        }
        return Math.max(ans,cnt);
    }
}