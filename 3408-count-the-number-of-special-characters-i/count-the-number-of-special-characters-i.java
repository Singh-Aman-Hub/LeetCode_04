class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set= new HashSet<>();
        for(char ch: word.toCharArray()){
            set.add(ch);
        }
        int ans =0;
        for(char ch: set){
            if(Character.isLowerCase(ch) && set.contains((char)(ch-32)))ans++;
        }
        return ans;
    }
}