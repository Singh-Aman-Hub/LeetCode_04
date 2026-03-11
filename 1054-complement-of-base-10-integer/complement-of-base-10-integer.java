class Solution {
    public int bitwiseComplement(int n) {
        int ex=1;
        while(ex<n){
            ex=ex<<1;
            ex= ex|1;
        }
        return (~n)&ex;
    }
}