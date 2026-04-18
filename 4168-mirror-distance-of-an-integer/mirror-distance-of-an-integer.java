class Solution {
    public int reverse(int n){
        int newNum= 0;
        while(n>0){
            newNum *=10;
            newNum+= n%10;
            n/=10; 

        }
        return newNum;
    }
    public int mirrorDistance(int n) {
        return Math.abs(n- reverse(n));
    }
}