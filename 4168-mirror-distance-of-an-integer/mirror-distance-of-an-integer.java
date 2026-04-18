class Solution {
    
    public int mirrorDistance(int n) {
        StringBuilder sb= new StringBuilder(String.valueOf(n)).reverse();
        int newNum= Integer.parseInt(sb.toString());

        return Math.abs(n- newNum);
    }
}