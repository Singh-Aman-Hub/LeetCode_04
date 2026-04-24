class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int ans=0;
        int space=0;

        for(int i=0;i<moves.length();i++){
            char ch= moves.charAt(i);
            if(ch=='L')ans--;
            else if(ch=='R')ans++;
            else space++;
        }
        ans= Math.abs(ans);
        return ans+space;
    }
}