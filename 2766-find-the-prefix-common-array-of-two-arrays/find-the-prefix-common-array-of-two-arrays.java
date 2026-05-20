class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans[]= new int[A.length];
        int prev=0;
        HashSet<Integer>set= new HashSet<>();
        for(int i=0;i< A.length;i++){
            ans[i]+=prev;
            if(!set.contains(A[i]))set.add(A[i]);
            else ans[i]++;

            if(!set.contains(B[i]))set.add(B[i]);
            else ans[i]++;

            prev= ans[i];
        }
        return ans;
    }
}