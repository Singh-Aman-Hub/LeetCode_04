class Solution {
    public int reverse (int n){
        StringBuilder sb= new StringBuilder(String.valueOf(n)).reverse();
        int value= Integer.parseInt(sb.toString());
        return value;
    }
    public int mirrorDistance(int n) {
        int diff= Math.abs(n- reverse(n));
        return diff;
    }
}