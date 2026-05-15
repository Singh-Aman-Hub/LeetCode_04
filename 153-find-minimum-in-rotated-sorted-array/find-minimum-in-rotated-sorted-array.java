class Solution {
    public int findMin(int[] nums) {
        // int ans=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int mid= (i+j)/2;
            if(nums[i]<=nums[mid] && nums[i]> nums[j]){
                i=mid+1;
            }
            else{
                j= mid;
            }
           
        }

        return nums[i];
    }
}