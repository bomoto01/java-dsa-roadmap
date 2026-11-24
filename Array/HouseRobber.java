public class HouseRobber {

    public static int rob(int[] nums) {

        // TODO 1: Xử lý trường hợp mảng rỗng
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // TODO 2: Xử lý trường hợp chỉ có 1 ngôi nhà
        if (nums.length == 1) {
            return nums[0];
        }

        // TODO 3: Khởi tạo mảng dp
        int[] dp = new int[nums.length];

        // TODO 4: Thiết lập Base Case
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // TODO 5: Sử dụng vòng lặp tính kết quả DP
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(
                dp[i - 1],
                dp[i - 2] + nums[i]
            );
        }

        // TODO 6: Trả về kết quả
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2, 7, 9, 3, 1})); // 12
        System.out.println(rob(new int[]{1, 2, 3, 1}));    // 4
        System.out.println(rob(new int[]{2, 7, 9, 3, 1, 5})); // 16
        System.out.println(rob(new int[]{5}));             // 5
        System.out.println(rob(new int[]{}));              // 0
    }
}
