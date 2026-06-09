class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long mini= Integer.MAX_VALUE;
        long maxie= Integer.MIN_VALUE;

        for(int x: nums){
            mini= Math.min(mini, x);
            maxie= Math.max(maxie, x);
        }
        return (long)(maxie-mini)*(long)k;
    }
}