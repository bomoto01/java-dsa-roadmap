public class FibonacciTabulation {

    public static int fibonacci(int n) {
        // TODO 1: Xử lý trường hợp n = 0 hoặc n = 1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // TODO 2: Khởi tạo mảng dp
        int[] dp = new int[n + 1];

        // TODO 3: Thiết lập Base Case
        dp[0] = 0;
        dp[1] = 1;

        // TODO 4: Sử dụng vòng lặp tính Fibonacci
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // TODO 5: Trả về kết quả
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(0));  // 0
        System.out.println(fibonacci(1));  // 1
        System.out.println(fibonacci(5));  // 5
        System.out.println(fibonacci(10)); // 55
    }
}