import java.util.Arrays;

public class FibonacciMemoization {

    public static int fibonacci(int n, int[] dp) {

        // Base Case
        if (n <= 1) {
            return n;
        }

        // Đã tính trước đó
        if (dp[n] != -1) {
            return dp[n];
        }

        // Tính toán và lưu kết quả
        dp[n] = fibonacci(n - 1, dp)
              + fibonacci(n - 2, dp);

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(fibonacci(n, dp)); // 8
    }
}