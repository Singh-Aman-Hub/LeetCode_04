class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long curr = mass;
        Arrays.sort(asteroids);

        for(int i: asteroids){
            if(curr<i)return false;
            else curr+= i;
        }
        return true;
    }
}