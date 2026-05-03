class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> map= new HashMap<>();
        int ele = nums[0];
        int freq= 1;
        for(int i=1;i< nums.length;i++){
            if(nums[i]!= ele){
                map.put(ele, freq);
                freq=1;
                ele= nums[i];
            }else{
                freq++;
            }
            
            
        }
        map.put(ele, freq);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((a,b)-> b.getValue().compareTo(a.getValue()));
            int ans[]= new int[k];
            int i=0;
            for(Map.Entry<Integer, Integer> e: list){
                ans[i++]= e.getKey();
                
                if(k==i)return ans;
            }
            return ans;



    }
}