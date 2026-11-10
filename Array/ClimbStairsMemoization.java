public class ClimbStairsMemoization {

    public static int climbStairs(int n, int[] dp) {
    // Base Case
    if (n <= 1) return 1;

    // Kiểm tra kết quả đã tính
    if (dp[n] != -1) return dp[n];

    // Tính và lưu kết quả
    dp[n] = climbStairs(n - 1, dp)
          + climbStairs(n - 2, dp);

    return dp[n];
    }
}
