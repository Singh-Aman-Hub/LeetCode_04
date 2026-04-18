class Solution {
    public int reverse(int n){
        int newNum= 0;
        while(n>0){
            newNum*=10;
            newNum+= n%10;
            n/=10;
        }
        return newNum;
    }
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int ans= Integer.MAX_VALUE;
        for(int i=0;i< nums.length;i++){
            int n= nums[i];
            int reversed= reverse(n);
            if(map.containsKey(n)){
                ans= Math.min(ans, Math.abs(i-map.get(n)));
                
            }
             map.put(reversed, i);
        }
        if(ans==Integer.MAX_VALUE)ans=-1;
        return ans;


    }
}