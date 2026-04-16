class Solution {
    public boolean isValid(String s) {
        Deque<Character> dq= new ArrayDeque<>();
        for(char ch: s.toCharArray()){
            if(ch=='(')dq.push(')');
            else if(ch=='{')dq.push('}');
            else if(ch=='[')dq.push(']');

            else{
                if(dq.size()<1)return false;
                char ele= dq.pop();
                if(ch!=ele)return false;
                // else return true;
            }
            
        }
        if(dq.size()>0)return false;
        return true;
    }
}