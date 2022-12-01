class Solution {
    public int climbStairs(int n) {
        if(n<=1) return n;
        int prev=1;
        int prev2=2;
        for( int i=3;i<=n;i++){
            int newValue=prev+prev2;
            prev=prev2;
            prev2=newValue;
        }
        return prev2;
    }
}