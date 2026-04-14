class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max1= Integer.MIN_VALUE;
        int min1= Integer.MAX_VALUE;

        for(int num: nums){
            max1= Math.max(max1, num);
            min1 =Math.min(min1, num);
        }
        max1-= k;
        min1+= k;

        if(max1<min1)return 0;
        return max1- min1;
    }
}