class Solution {
    public int recur(int [] nums, int target, int st, int end){
        if(st>end)return -1;
        int mid = (st+end)/2;

        if(nums[mid]==target)return mid;
        if(nums[st]<= nums[mid]){
            if(nums[st]<= target && nums[mid]> target){
                return recur(nums, target, st, mid-1);
            }else{
                return recur(nums, target, mid+1, end);
            }
            
        }
        else {
            if(nums[mid]<target && nums[end]>= target){
                return recur(nums, target, mid+1, end);
            }else{
                return recur(nums, target, st, mid-1);
            }
        }

       
    }
    public int search(int[] nums, int target) {
        int st=0;
        int end = nums.length-1;
        return recur(nums, target, st, end);

    }
}