class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb=new StringBuilder(num);

        for(int i= num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                return sb.toString();
            }else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return "";
    }
}