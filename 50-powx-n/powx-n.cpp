class Solution {
public:
    //double recur(dounle x,int n)
    double myPow(double x, int a) {
        if(x==1)return 1;
        long long n=a;
        if(n==0){
            return 1;
        }
        if(n<0){
            n=abs(n);
            x=1/x;
        }

        double ans= myPow(x,n/2);
        if(n%2==0){
            return ans*ans;
        }else{
            return ans*ans*x;
        }
        return ans;
    }
};