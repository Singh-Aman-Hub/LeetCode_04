class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()<= k)return "0";
        Stack<Character> st= new Stack<>();
        int i=0;
        for(;i<num.length();i++){
            // if(k==0)break;
            while(!st.isEmpty() && k>0 &&st.peek()>num.charAt(i)){
                k--;
                st.pop();
                
            }
            st.push(num.charAt(i));
            
            // if(st.isEmpty())
        }
        // i++;
        while(k>0 && !st.isEmpty()){
            k--;
            st.pop();
        }
        StringBuilder sb= new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}