class Solution {
    public Set<Integer> set= new HashSet<>();
    public boolean canReach(int[] arr, int start) {
        
        if(start<0 || start>= arr.length ||
        set.contains(start))return false;

        if(arr[start]==0)return true;
        set.add(start);

    

        return canReach(arr, start+arr[start]) || 
        canReach(arr, start-arr[start]);

    }
}