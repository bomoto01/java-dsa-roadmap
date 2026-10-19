public class MaxSumSubarray {
    public static int maxSumSubarray(int[] nums, int k) {
        if (nums == null || k <= 0 || k > nums.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        int windowSum = 0;

        // TODO 1: Tính tổng k phần tử đầu tiên
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // TODO 2: Khởi tạo maxSum
        int maxSum = windowSum;

        // TODO 3: Duyệt các phần tử còn lại
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];

            if (maxSum < windowSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        System.out.println(maxSumSubarray(nums, 3)); // 9
    }
}
