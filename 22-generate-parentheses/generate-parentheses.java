class Solution {
    public void help(String s, List<String> list, int open, int close, int n){
        if(s.length()==n*2){
            list.add(s);
            return;
        }
        if(open <n){
            help(s+"(", list, open+1, close, n);
        }
        if(close < open){
            help(s+")", list, open, close+1, n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list= new ArrayList<>();
        help("",list,0,0, n);
        return list;
    }
}