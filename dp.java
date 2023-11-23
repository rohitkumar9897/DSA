public class dp {
    
    public static int findCatlan(int n, int dp[]){
        if(dp[n]!=0){
            return dp[n];
        }
        for(int i=0; i<n; i++){
            dp[n]+=findCatlan(i,dp)*findCatlan(n-i-1,dp);
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=30;
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        System.out.println(findCatlan(n,dp));
    }
}
