class Solution {
    public boolean judgeCircle(String moves) {
        int hr=0;
        int vr=0;
        for(int itr=0;itr< moves.length();itr++){
            char ch= moves.charAt(itr);

            if(ch=='U')vr+=1;
            else if(ch=='D') vr-=1;

            else if(ch=='R')hr+=1;
            else if(ch=='L')hr-=1;

            else return false;
        }
        if(hr==0 && vr==0)return true;
        return false;
    }
}