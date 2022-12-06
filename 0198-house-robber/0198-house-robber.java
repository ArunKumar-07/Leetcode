class Solution {
    public int rob(int[] nums) {
        int n =nums.length-1;
       
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return find(nums,dp,n);
    }
    int find(int[] nums,int[] dp,int n){
        if(n==0) return nums[n];
        if(n<1) return 0;
        if(dp[n]!=-1) return dp[n];
        int process=nums[n]+find(nums,dp,n-2);
        int unProcess=0+find(nums,dp,n-1);
        return dp[n]=Math.max(process,unProcess);
    }
}