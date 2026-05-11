class Solution {
    public int[] separateDigits(int[] nums) {
        List <Integer> list= new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            int ele= nums[i];
            while(ele>0){
                list.add(0,ele%10);
                ele/=10;
            }
        }
        int arr[]= new int[list.size()];
        for(int i=0;i< list.size();i++){
            arr[i]= list.get(i);
        }
        return arr;
    }
}